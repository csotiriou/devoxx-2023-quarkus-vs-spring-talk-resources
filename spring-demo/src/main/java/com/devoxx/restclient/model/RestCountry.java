package com.devoxx.restclient.model;

public class RestCountry {

    public static final RestCountry DUMMY;

    static {
        RestCountry dummy = new RestCountry();
        Name name = new Name();
        name.setCommon("dummy");
        dummy.setName(name);
        dummy.setCca2("du");
        DUMMY = dummy;
    }

    private Name name;
    private String cca2;


    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    // constructor
    public RestCountry() {}

    // inner classes
    public static class Name {
        private String common;

        public String getCommon() {
            return common;
        }

        public void setCommon(String common) {
            this.common = common;
        }
    }


}
