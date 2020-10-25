package sk.jaro.database;

import sk.jaro.simpleormframework.dbaccess.DatabaseAccess;
import sk.jaro.simpleormframework.dbaccess.SormManager;
import sk.jaro.utils.Auto;
import sk.jaro.utils.Osoba;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OsobaDao extends Dao {

    public OsobaDao() throws SQLException {
        super();
    }

    public long create(Osoba osoba) throws Exception{
        long id = -1L;
        PreparedStatement st = null;
        try{
            String[] generatedId = {"ID"};
            st = getConn().prepareStatement("INSERT INTO Osoba (MENO,VEK,DATUM_NARODENIA) VALUES (?,?,?)");
            st.setString(1,osoba.getMeno());
            st.setInt(1,osoba.getVek());
            st.setDate(1,new java.sql.Date(osoba.getDatumNarodenia().getTime()));
            st.execute();

            try(ResultSet generatedColumn = st.getGeneratedKeys()){
                if(generatedColumn.next()){
                    id = generatedColumn.getLong(1);
                }else {
                    throw new SQLException("Vytvorenie Osoby sa nepodarilo. Nevratilo sa ziadne id.");
                }

            }

        }catch (Exception e){
            throw new Exception(e);
        }finally {
            try {
                if (st != null)
                    st.close();
            } catch (SQLException e) {
                System.err.println("....");
            }
        }
        return id;
    }


//    public static void main(String[] args) {
//        OsobaDao dao = null;
//        try{
//            dao = new OsobaDao();
//            long id = dao.create(null);
//            dao.commit();
//        }catch (Exception e){
//            if(dao!=null)
//                dao.rollBack();
//        }finally {
//            if(dao!=null){
//                dao.disconnect();
//            }
//        }
//    }

    public static void main(String[] args) throws Exception {
        SormManager sormManager = new SormManager();
//        Osoba o = sormManager.getEntityByid(1L, Osoba.class);
//        Osoba o2 = sormManager.getEntityByid(2L, Osoba.class);
//
//        System.out.println(o);
//        System.out.println(o2);


        Auto a1 = sormManager.getEntityByid(1L, Auto.class);
        Auto a2 = sormManager.getEntityByid(2L, Auto.class);
        System.out.println(a1);
        System.out.println(a2);

    }

}
