package MODEL;

public class Student {
    String name;
    Integer age;
    Boolean gender;
    String IdNo;

    public Student() {
    }

    public Student(String name, Integer age, Boolean gender, String idNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        IdNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getIdNo() {
        return IdNo;
    }

    public void setIdNo(String idNo) {
        IdNo = idNo;
    }

    @Override
    public String toString() {
        String sex;
        if (gender == true)
            sex = "boy";
        else
            sex = "girl";
        return
                "name='" + name + '\'' +
                        ", age=" + age +
                        ", gender=" + sex +
                        ", IdNo='" + IdNo + '\'' ;
    }
}
