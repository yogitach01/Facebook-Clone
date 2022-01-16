package facebook;
class AddAccounts 
{
    public static void addAccounts() 
    {
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

      

        // Ramadhir Singh
        Account ramadhir = new Account("Ramadhir", "Singh", "7789652014", "ramadhirsingh@gmail.com", "ramadhirsingh",
                        "saanp", "04/10/1960", 'M', "BETA... TUMSE NA HO PAYEGA!");
        CreateAccount.accounts.add(ramadhir);

        // Salman Khan
        Account salman = new Account("Salman", "Khan", "78903240053", "salmankhan@gmail.com", "salmankhan",
                "aishwarya", "12/27/1965", 'M', "HEAVY DRIVER");
        CreateAccount.accounts.add(salman);

        // Babu Bhaiyya
        Account babubhaiyya = new Account("Baburao Ganpatrao", "Apte", "9021473201", "babubhaiyya@gmail.com", "babubhaiyya", "dhoti", "09/16/1965", 'M', "AE TU JAA RE!");
        CreateAccount.accounts.add(babubhaiyya);

        // Deepika Padukone
        Account deepika = new Account("Deepika", "Padukone", "9010547211", "deepikapadukone@gmail.com",
                        "deepikapadukone", "ranbir", "01/05/1986", 'F', "MERA LEHENGA KAHA HAI");
        CreateAccount.accounts.add(deepika);

        // Ranveer Singh
        Account ranveer = new Account("Ranveer", "Singh", "7901145782", "ranveersingh@gmail.com",
                        "ranveersingh", "deepu", "07/06/1985", 'M', "LEHENGA YAHA HAI");
        CreateAccount.accounts.add(ranveer);

        // Jethalal Gada
        Account jethiya = new Account("Jethalal Champaklal", "Gada", "88892231002", "jethalalchampaklalgada@gmail.com",               "jethalalgada", "babitaji","10/20/1970", 'M', "CHUP HO JAA SAATVI FAIL... CHUP HO JAA!");
        CreateAccount.accounts.add(jethiya);

        // Mahendrasingh Dhoni
        Account mahi = new Account("Mahendrasingh", "Dhoni", "9002142157", "msdhoni@gmail.com", "mahi",
                        "india", "07/07/1981", 'M', "CAPTAIN COOL");
        CreateAccount.accounts.add(mahi);

        // Emraan Hashmi
        Account emraan = new Account("Emraan", "Hashmi", "9711263045", "emraanhashmi@gmail.com", "emraanhashmi",
                        "jannat", "03/24/1979", 'M', "MAI RAHOON YA NA RAHOON");
        CreateAccount.accounts.add(emraan);

        // Harry Potter
        Account harry = new Account("Harry", "Potter", "8888023651", "harrypotterf@gmail.com",
                        "harrypotter", "ginny", "07/31/1980", 'M', "EXPELLIARMUS");
        CreateAccount.accounts.add(harry);

        // Hermione Granger
        Account hermione = new Account("Hermione", "Granger", "7441205338", "hermionegranger@gmail.com",
                        "hermionegranger", "ron", "24/08/1984", 'F', "IT'S LEVI-OOO-SA, NOT LEVIO-SA");
        CreateAccount.accounts.add(hermione);

        // Severus Snape
        Account snape = new Account("Severus", "Snape", "7894456321", "severussnape@gmail.com", "severussnape",
                        "lily", "01/09/1960", 'M', "ALWAYS!");
        CreateAccount.accounts.add(snape);

        // Albus Dumbledore
        Account dumbledore = new Account("Albus", "Dumbledore", "9802136547", "albusdumbledore@gmail.com", "albusdumbledore", "alohomora",
                        "05/19/1881", 'M', "HAPPINESS CAN BE FOUND, EVEN IN THE DARKEST OF TIMES,\n\t\t\t\t  IF ONE ONLY REMEMBERS TO TURN ON THE LIGHT");
        CreateAccount.accounts.add(dumbledore);

        // Lord Voldemort
        Account voldy = new Account("Tom", "Riddle", "7563258941", "lordvoldemort@gmail.com",
                        "lordvoldemort", "nagini", "12/31/1926", 'M', "AVADA KEDAVRA");
        CreateAccount.accounts.add(voldy);

        // Thanos
        Account thanos = new Account("Thanos", "", "8002415789", "thanos@gmail.com", "thanos", "infinitystones",
                        "1013-1018", 'M', "I AM INEVITABLE");
        CreateAccount.accounts.add(thanos);
        
        // Iron Man
        Account ironman = new Account("Tony", "Stark", "9210457001", "ironman@gmail.com", "ironman", "cheeseburger",
                        "05/29/1970", 'M', "I AM IRON MAN");
        CreateAccount.accounts.add(ironman);

        // Thor
        Account thor = new Account("Thor", "Odinson", "9631452780", "thor@gmail.com", "thor", "asgard",
                        "04/04/1982", 'M', "BRING THE THANOS");
        CreateAccount.accounts.add(thor);

        // Captain Marvel
        Account captainmarvel = new Account("Carol", "Danvers", "7003516054", "caroldanvers@gmail.com",
                        "caroldanvers", "livingstone", "12/12/1967", 'F', "BUSY");
        CreateAccount.accounts.add(captainmarvel);

        // Black Widow
        Account blackwidow = new Account("Natasha", "Romanoff", "9700042563", "natasharomanoff@gmail.com", "natasharomanoff",
                        "budapest", "08/24/1984", 'F', "AVENGERS = FAMILY");
        CreateAccount.accounts.add(blackwidow);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////


        ///////////////////////////////////////////// FIZA ///////////////////////////////////////////////////////////
      
        jethiya.addFriend(dumbledore);
        dumbledore.addFriend(jethiya);

        jethiya.addFriend(mahi);
        mahi.addFriend(jethiya);

        jethiya.addFriend(emraan);
        emraan.addFriend(jethiya);

        jethiya.addFriend(captainmarvel);
        captainmarvel.addFriend(jethiya);

        jethiya.addFriend(deepika);
        deepika.addFriend(jethiya);

        jethiya.addFriend(thor);
        thor.addFriend(jethiya);

        jethiya.addFriend(blackwidow);
        blackwidow.addFriend(jethiya);
        ////////////////////////////////////////////// JETHIYA ////////////////////////////////////////////////////////



        /////////////////////////////////////////////// MAHI //////////////////////////////////////////////////////////
        mahi.addFriend(ranveer);
        ranveer.addFriend(mahi);

        mahi.addFriend(ironman);
        ironman.addFriend(mahi);

        mahi.addFriend(snape);
        snape.addFriend(mahi);

        mahi.addFriend(deepika);
        deepika.addFriend(mahi);

        mahi.addFriend(dumbledore);
        dumbledore.addFriend(mahi);

        mahi.addFriend(captainmarvel);
        captainmarvel.addFriend(mahi);

        blackwidow.addFriend(captainmarvel);
        captainmarvel.addFriend(blackwidow);
        /////////////////////////////////////////////// MAHI //////////////////////////////////////////////////////////


        /////////////////////////////////////////////// AVENGERS //////////////////////////////////////////////////////////
        thor.addFriend(ironman);
        ironman.addFriend(thor);


        thor.addFriend(blackwidow);
        blackwidow.addFriend(thor);

        thor.addFriend(captainmarvel);
        captainmarvel.addFriend(thor);

        thor.addFriend(deepika);
        deepika.addFriend(thor);

        captainmarvel.addFriend(hermione);
        hermione.addFriend(captainmarvel);

        captainmarvel.addFriend(blackwidow);
        blackwidow.addFriend(captainmarvel);

        ironman.addFriend(captainmarvel);
        captainmarvel.addFriend(ironman);
        /////////////////////////////////////////////// AVENGERS //////////////////////////////////////////////////////////


        /////////////////////////////////////////////// HP /////////////////////////////////////////////////////////
        snape.addFriend(hermione);
        hermione.addFriend(snape);

        snape.addFriend(thanos);
        thanos.addFriend(snape);

        snape.addFriend(dumbledore);
        dumbledore.addFriend(snape);

        snape.addFriend(voldy);
        voldy.addFriend(snape);

        snape.addFriend(deepika);
        deepika.addFriend(snape);

        snape.addFriend(ironman);
        ironman.addFriend(snape);

        snape.addFriend(harry);
        harry.addFriend(snape);

        harry.addFriend(hermione);
        hermione.addFriend(harry);

        harry.addFriend(dumbledore);
        dumbledore.addFriend(harry);

        hermione.addFriend(dumbledore);
        dumbledore.addFriend(hermione);
        /////////////////////////////////////////////// HP /////////////////////////////////////////////////////////

    }
}
