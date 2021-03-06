package by.bsuir.ief.rest.model.pisl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by andrey on 12.04.2016.
 */
@Entity
@javax.persistence.Table(name = "person_pisl")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PersonPisl {

    private int idpersonPisl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @javax.persistence.Column(name = "idperson_pisl",insertable = true, updatable = true)
    public int getIdpersonPisl() {
        return idpersonPisl;
    }

    public void setIdpersonPisl(int idpersonPisl) {
        this.idpersonPisl = idpersonPisl;
    }

    private String firstName;

    @Basic
    @javax.persistence.Column(name = "first_name", nullable = false, length = 45)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String name;

    @Basic
    @javax.persistence.Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String lastName;

    @Basic
    @javax.persistence.Column(name = "last_name", nullable = false, length = 45)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String sex;

    @Basic
    @javax.persistence.Column(name = "sex", nullable = false, length = 45)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private String pasportNumber;

    @Basic
    @javax.persistence.Column(name = "pasport_number", nullable = false, length = 45)
    public String getPasportNumber() {
        return pasportNumber;
    }

    public void setPasportNumber(String pasportNumber) {
        this.pasportNumber = pasportNumber;
    }

    private String hphone;

    @Basic
    @javax.persistence.Column(name = "hphone", nullable = true, length = 45)
    public String getHphone() {
        return hphone;
    }

    public void setHphone(String hphone) {
        this.hphone = hphone;
    }

    private java.util.Date birthday;

    @Basic
    @Temporal(TemporalType.DATE)
    @javax.persistence.Column(name = "birthday", nullable = false)
    public java.util.Date getBirthday() {
        return birthday;
    }

    public void setBirthday( java.util.Date birthday) {
        this.birthday = birthday;
    }

    private String serialPasport;

    @Basic
    @javax.persistence.Column(name = "serial_pasport", nullable = false, length = 45)
    public String getSerialPasport() {
        return serialPasport;
    }

    public void setSerialPasport(String serialPasport) {
        this.serialPasport = serialPasport;
    }

    private String organizationGivePassport;

    @Basic
    @javax.persistence.Column(name = "organization_give_passport", nullable = false, length = 45)
    public String getOrganizationGivePassport() {
        return organizationGivePassport;
    }

    public void setOrganizationGivePassport(String organizationGivePassport) {
        this.organizationGivePassport = organizationGivePassport;
    }

    private java.util.Date dateGivePasport;

    @Basic
    @Temporal(TemporalType.DATE)
    @javax.persistence.Column(name = "date_give_pasport", nullable = false)
    public java.util.Date getDateGivePasport() {
        return dateGivePasport;
    }

    public void setDateGivePasport( java.util.Date dateGivePasport) {
        this.dateGivePasport = dateGivePasport;
    }


    private String identifyNumber;

    @Basic
    @javax.persistence.Column(name = "identify_number", nullable = false, length = 45)
    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber;
    }

    private String placeOfBirth;

    @Basic
    @javax.persistence.Column(name = "place_of_birth", nullable = false, length = 45)
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    private Cities adressLiving;

    @Basic
    @javax.persistence.Column(name = "adress_living", nullable = false, length = 45)
    public Cities getAdressLiving() {
        return adressLiving;
    }

    public void setAdressLiving(Cities adressLiving) {
        this.adressLiving = adressLiving;
    }

    private String mphone;

    @Basic
    @javax.persistence.Column(name = "mphone", nullable = true, length = 45)
    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    private String eMail;

    @Basic
    @javax.persistence.Column(name = "e_mail", nullable = true, length = 45)
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    private String workingPlace;

    @Basic
    @javax.persistence.Column(name = "working_place", nullable = false, length = 45)
    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    private String post;

    @Basic
    @javax.persistence.Column(name = "post", nullable = false, length = 45)
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    private Cities cityResidence;

    @Basic
    @javax.persistence.Column(name = "city_residence", nullable = false, length = 45)
    public Cities getCityResidence() {
        return cityResidence;
    }

    public void setCityResidence(Cities cityResidence) {
        this.cityResidence = cityResidence;
    }

    private String addressResidence;

    @Basic
    @javax.persistence.Column(name = "address_residence", nullable = false, length = 45)
    public String getAddressResidence() {
        return addressResidence;
    }

    public void setAddressResidence(String addressResidence) {
        this.addressResidence = addressResidence;
    }

    private MaritalStatus maritalStatus;

    @Basic
    @javax.persistence.Column(name = "marital_status", nullable = false, length = 45)
    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    private Nationality nationality;

    @Basic
    @javax.persistence.Column(name = "nationality", nullable = false, length = 45)
    public Nationality getNationality() {
        return nationality;
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality;
    }

    private Disability disability;

    @Basic
    @javax.persistence.Column(name = "disability", nullable = false, length = 45)
    public Disability getDisability() {
        return disability;
    }

    public void setDisability(Disability disability) {
        this.disability = disability;
    }

    private boolean pensioner;

    @Basic
    @javax.persistence.Column(name = "pensioner", nullable = false)
    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    private Double monthlyIncome;

    @Basic
    @javax.persistence.Column(name = "monthly_income", nullable = true, precision = 0)
    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    private boolean reservist;

    @Basic
    @javax.persistence.Column(name = "Reservist", nullable = false)
    public boolean isReservist() {
        return reservist;
    }

    public void setReservist(boolean reservist) {
        this.reservist = reservist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonPisl that = (PersonPisl) o;

        if (idpersonPisl != that.idpersonPisl) return false;
        if (pensioner != that.pensioner) return false;
        if (reservist != that.reservist) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (pasportNumber != null ? !pasportNumber.equals(that.pasportNumber) : that.pasportNumber != null)
            return false;
        if (hphone != null ? !hphone.equals(that.hphone) : that.hphone != null) return false;
        if (birthday != null ? !birthday.equals(that.birthday) : that.birthday != null) return false;
        if (serialPasport != null ? !serialPasport.equals(that.serialPasport) : that.serialPasport != null)
            return false;
        if (organizationGivePassport != null ? !organizationGivePassport.equals(that.organizationGivePassport) : that.organizationGivePassport != null)
            return false;
        if (dateGivePasport != null ? !dateGivePasport.equals(that.dateGivePasport) : that.dateGivePasport != null)
            return false;
        if (identifyNumber != null ? !identifyNumber.equals(that.identifyNumber) : that.identifyNumber != null)
            return false;
        if (placeOfBirth != null ? !placeOfBirth.equals(that.placeOfBirth) : that.placeOfBirth != null) return false;
        if (adressLiving != null ? !adressLiving.equals(that.adressLiving) : that.adressLiving != null) return false;
        if (mphone != null ? !mphone.equals(that.mphone) : that.mphone != null) return false;
        if (eMail != null ? !eMail.equals(that.eMail) : that.eMail != null) return false;
        if (workingPlace != null ? !workingPlace.equals(that.workingPlace) : that.workingPlace != null) return false;
        if (post != null ? !post.equals(that.post) : that.post != null) return false;
        if (cityResidence != null ? !cityResidence.equals(that.cityResidence) : that.cityResidence != null)
            return false;
        if (addressResidence != null ? !addressResidence.equals(that.addressResidence) : that.addressResidence != null)
            return false;
        if (maritalStatus != null ? !maritalStatus.equals(that.maritalStatus) : that.maritalStatus != null)
            return false;
        if (nationality != null ? !nationality.equals(that.nationality) : that.nationality != null) return false;
        if (disability != null ? !disability.equals(that.disability) : that.disability != null) return false;
        if (monthlyIncome != null ? !monthlyIncome.equals(that.monthlyIncome) : that.monthlyIncome != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idpersonPisl;
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (pasportNumber != null ? pasportNumber.hashCode() : 0);
        result = 31 * result + (hphone != null ? hphone.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (serialPasport != null ? serialPasport.hashCode() : 0);
        result = 31 * result + (organizationGivePassport != null ? organizationGivePassport.hashCode() : 0);
        result = 31 * result + (dateGivePasport != null ? dateGivePasport.hashCode() : 0);
        result = 31 * result + (identifyNumber != null ? identifyNumber.hashCode() : 0);
        result = 31 * result + (placeOfBirth != null ? placeOfBirth.hashCode() : 0);
        result = 31 * result + (adressLiving != null ? adressLiving.hashCode() : 0);
        result = 31 * result + (mphone != null ? mphone.hashCode() : 0);
        result = 31 * result + (eMail != null ? eMail.hashCode() : 0);
        result = 31 * result + (workingPlace != null ? workingPlace.hashCode() : 0);
        result = 31 * result + (post != null ? post.hashCode() : 0);
        result = 31 * result + (cityResidence != null ? cityResidence.hashCode() : 0);
        result = 31 * result + (addressResidence != null ? addressResidence.hashCode() : 0);
        result = 31 * result + (maritalStatus != null ? maritalStatus.hashCode() : 0);
        result = 31 * result + (nationality != null ? nationality.hashCode() : 0);
        result = 31 * result + (disability != null ? disability.hashCode() : 0);
        result = 31 * result + (pensioner ? 1 : 0);
        result = 31 * result + (monthlyIncome != null ? monthlyIncome.hashCode() : 0);
        result = 31 * result + (reservist ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PersonPisl{" +
                "idpersonPisl=" + idpersonPisl +
                ", firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + sex + '\'' +
                ", pasportNumber='" + pasportNumber + '\'' +
                ", hphone='" + hphone + '\'' +
                ", birthday=" + birthday +
                ", serialPasport='" + serialPasport + '\'' +
                ", organizationGivePassport='" + organizationGivePassport + '\'' +
                ", dateGivePasport=" + dateGivePasport +
                ", identifyNumber='" + identifyNumber + '\'' +
                ", placeOfBirth='" + placeOfBirth + '\'' +
                ", adressLiving=" + adressLiving +
                ", mphone='" + mphone + '\'' +
                ", eMail='" + eMail + '\'' +
                ", workingPlace='" + workingPlace + '\'' +
                ", post='" + post + '\'' +
                ", cityResidence=" + cityResidence +
                ", addressResidence='" + addressResidence + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", nationality=" + nationality +
                ", disability=" + disability +
                ", pensioner=" + pensioner +
                ", monthlyIncome=" + monthlyIncome +
                ", reservist=" + reservist +
                '}';
    }
}
