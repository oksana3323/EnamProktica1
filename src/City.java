public enum City {
    BISHKEK("Kyrgyzstan"),
    MOSCOW("Russia"),
    WASHINGTON("America"),
    ASTANA("Kazakstan"),
    BERLIN("Germaya");
  private String country;

    City(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }




    }



