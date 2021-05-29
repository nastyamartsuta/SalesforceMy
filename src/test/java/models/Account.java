package models;

public class Account {
    String accountName, phone, website, employees, billingCity, billingZipPostalCode, billingStateProvince,
            billingCountry, shippingCity, shippingZipPostalCode, shippingStateProvince, shippingCountry;
    String type, industry;
    String description, billingStreet, shippingStreet;

    public Account(String accountName, String phone, String website, String employees,
                   String billingCity, String billingZipPostalCode, String billingStateProvince,
                   String billingCountry, String shippingCity, String shippingZipPostalCode,
                   String shippingStateProvince, String shippingCountry,
                   String type, String industry,
                   String description, String billingStreet, String shippingStreet) {
        this.accountName = accountName;
        this.phone = phone;
        this.website = website;
        this.employees = employees;
        this.billingCity = billingCity;
        this.billingZipPostalCode = billingZipPostalCode;
        this.billingStateProvince = billingStateProvince;
        this.billingCountry = billingCountry;
        this.shippingCity = shippingCity;
        this.shippingZipPostalCode = shippingZipPostalCode;
        this.shippingStateProvince = shippingStateProvince;
        this.shippingCountry = shippingCountry;
        this.type = type;
        this.industry = industry;
        this.description = description;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingZipPostalCode() {
        return billingZipPostalCode;
    }

    public void setBillingZipPostalCode(String billingZipPostalCode) {
        this.billingZipPostalCode = billingZipPostalCode;
    }

    public String getBillingStateProvince() {
        return billingStateProvince;
    }

    public void setBillingStateProvince(String billingStateProvince) {
        this.billingStateProvince = billingStateProvince;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingZipPostalCode() {
        return shippingZipPostalCode;
    }

    public void setShippingZipPostalCode(String shippingZipPostalCode) {
        this.shippingZipPostalCode = shippingZipPostalCode;
    }

    public String getShippingStateProvince() {
        return shippingStateProvince;
    }

    public void setShippingStateProvince(String shippingStateProvince) {
        this.shippingStateProvince = shippingStateProvince;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }
}
