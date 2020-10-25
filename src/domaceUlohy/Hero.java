package domaceUlohy;

//TASK 2
public class Hero {

        private ISpecialAbility abbilities;

        public void setAbbilities(ISpecialAbility abbilities) {
            this.abbilities = abbilities;
        }


        public static void main(String[] args) {

            System.out.println("TASK2");

            Hero hero1 = new Hero();
            Hero hero2 = new Hero();

            hero1.setAbbilities(new ISpecialAbility() {
                @Override
                public void attack() {
                    System.out.println("HERO A - ATTACK");
                }

                @Override
                public void defense() {
                    System.out.println("HERO A - Defense");
                }
            });

            hero2.setAbbilities(new ISpecialAbility() {
                @Override
                public void attack() {
                    System.out.println("HERO B - ATTACK");
                }

                @Override
                public void defense() {
                    System.out.println("HERO B - Defense");
                }
            });


            hero1.attack();
            hero1.attack();
            hero1.attack();
            hero1.defense();
            hero1.defense();
            hero1.defense();
        }

        public void attack() {
            this.abbilities.attack();
        }

        public void defense() {
            this.abbilities.defense();
        }

    }