public class World {
    public static void main(String[] args) {
        Country country = new Country("Russia");
        System.out.print("Hello " + country.countryName);
    }

    static class Country {
        private String countryName;
        private int populationSize;
        private int areaCountry;
        private String countryCapital;
        private boolean seaAccess;

        public Country(String countryName) {
            this.countryName = countryName;
        }

        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }
        public String getCountryName() {
            return countryName;
        }

        public void setPopulationSize(int populationSize) {
            this.populationSize = populationSize;
        }
        public int getPopulationSize() {
            return populationSize;
        }

        public void setAreaCountry(int areaCountry) {
            this.areaCountry = areaCountry;
        }
        public int getAreaCountry() {
            return areaCountry;
        }

        public void setCountryCapital(String countryCapital) {
            this.countryCapital = countryCapital;
        }
        public String getCountryCapital() {
            return countryCapital;
        }

        public void setSeaAccess(boolean seaAccess) {
            this.seaAccess = seaAccess;
        }
        public boolean getSeaAccess() {
            return seaAccess;
        }
    }
}
