package com.neusoft.sample.GreenDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "USER".
 */
public class User {

    private Long id;
    /** Not-null value. */
    private String phone;
    /** Not-null value. */
    private String psword;
    /** Not-null value. */
    private String role;
    private String server_id;
    private String province;
    private String province_nub;
    private String city;
    private String city_nub;
    private String region;
    private String region_nub;
    private String school;
    private String school_nub;
    private String grade;
    private String grade_nub;
    private String classes;
    private String classes_nub;
    private String productNo;
    private String user_icon_url;
    private String gender;
    private String qq_number;
    private String Weixin_number;
    private String Motto;
    private String Recipient;
    private String Address;
    private String mobile;
    private String Zip_code;
    private String email;

    public User(Long aLong, String string1, String cursorString, String string, String s5, String s4, String s3, String s2, String s1, String s, Object o, String mphone, String mpsword, String ROLE, Object o1, String province, String provinceNub, String city, String cityNub, String region, String regionNub, String school, String schoolNub, String grades, String gradeNub, String clss, String clssNub, Object o2) {
    }

    public User(Object o10, String mphone, String mpsword, String ROLE, Object o9, String province, String provinceNub, String city, String cityNub, String region, String regionNub, String school, String schoolNub, String grades, String gradeNub, String clss, String clssNub, Object o8, Object o7, Object o6, Object o5, Object o4, Object o3, Object o2, Object o1, Object o, Long id) {
        this.id = id;
    }

    public User(Long id, String phone, String psword, String role, String server_id, String province, String province_nub, String city, String city_nub, String region, String region_nub, String school, String school_nub, String grade, String grade_nub, String classes, String classes_nub, String productNo, String user_icon_url, String gender, String qq_number, String Weixin_number, String Motto, String Recipient,String mobile, String Address, String Zip_code, String email) {
        this.id = id;
        this.phone = phone;
        this.psword = psword;
        this.role = role;
        this.server_id = server_id;
        this.province = province;
        this.province_nub = province_nub;
        this.city = city;
        this.city_nub = city_nub;
        this.region = region;
        this.region_nub = region_nub;
        this.school = school;
        this.school_nub = school_nub;
        this.grade = grade;
        this.grade_nub = grade_nub;
        this.classes = classes;
        this.classes_nub = classes_nub;
        this.productNo = productNo;
        this.user_icon_url = user_icon_url;
        this.gender = gender;
        this.qq_number = qq_number;
        this.Weixin_number = Weixin_number;
        this.Motto = Motto;
        this.Recipient = Recipient;
        this.Address = Address;
        this.mobile = mobile;
        this.Zip_code = Zip_code;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getPhone() {
        return phone;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /** Not-null value. */
    public String getPsword() {
        return psword;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setPsword(String psword) {
        this.psword = psword;
    }

    /** Not-null value. */
    public String getRole() {
        return role;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setRole(String role) {
        this.role = role;
    }

    public String getServer_id() {
        return server_id;
    }

    public void setServer_id(String server_id) {
        this.server_id = server_id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince_nub() {
        return province_nub;
    }

    public void setProvince_nub(String province_nub) {
        this.province_nub = province_nub;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity_nub() {
        return city_nub;
    }

    public void setCity_nub(String city_nub) {
        this.city_nub = city_nub;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion_nub() {
        return region_nub;
    }

    public void setRegion_nub(String region_nub) {
        this.region_nub = region_nub;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool_nub() {
        return school_nub;
    }

    public void setSchool_nub(String school_nub) {
        this.school_nub = school_nub;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade_nub() {
        return grade_nub;
    }

    public void setGrade_nub(String grade_nub) {
        this.grade_nub = grade_nub;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getClasses_nub() {
        return classes_nub;
    }

    public void setClasses_nub(String classes_nub) {
        this.classes_nub = classes_nub;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getUser_icon_url() {
        return user_icon_url;
    }

    public void setUser_icon_url(String user_icon_url) {
        this.user_icon_url = user_icon_url;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getQq_Number() {
        return qq_number;
    }

    public void setQq_Number(String qq_number) {
        this.qq_number = qq_number;
    }

    public String getWeixin_number() {
        return Weixin_number;
    }

    public void setWeixin_number(String Weixin_number) {
        this.Weixin_number = Weixin_number;
    }

    public String getMotto() {
        return Motto;
    }

    public void setMotto(String Motto) {
        this.Motto = Motto;
    }

    public String getRecipient() {
        return Recipient;
    }

    public void setRecipient(String Recipient) {
        this.Recipient = Recipient;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getZip_code() {
        return Zip_code;
    }

    public void setZip_code(String Zip_code) {
        this.Zip_code = Zip_code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", psword='" + psword + '\'' +
                ", role='" + role + '\'' +
                ", server_id='" + server_id + '\'' +
                ", province='" + province + '\'' +
                ", province_nub='" + province_nub + '\'' +
                ", city='" + city + '\'' +
                ", city_nub='" + city_nub + '\'' +
                ", region='" + region + '\'' +
                ", region_nub='" + region_nub + '\'' +
                ", school='" + school + '\'' +
                ", school_nub='" + school_nub + '\'' +
                ", grade='" + grade + '\'' +
                ", grade_nub='" + grade_nub + '\'' +
                ", classes='" + classes + '\'' +
                ", classes_nub='" + classes_nub + '\'' +
                ", productNo='" + productNo + '\'' +
                ", user_icon_url='" + user_icon_url + '\'' +
                ", gender='" + gender + '\'' +
                ", qq_number='" + qq_number + '\'' +
                ", Weixin_number='" + Weixin_number + '\'' +
                ", Motto='" + Motto + '\'' +
                ", Recipient='" + Recipient + '\'' +
                ", Address='" + Address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", Zip_code='" + Zip_code + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
