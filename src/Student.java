public class Student {
    private String dr;
    private String fo;
    private int age;

    public void setDr(String dr) {
        this.dr = dr;
    }

    public void setFo(String fo) {
        this.fo = fo;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getDr() {
        return dr;
    }

    public String getFo() {
        return fo;
    }

    public int getAge() {
            return age;

            }




    @Override
    public String toString() {
        return "Student" + "\n" +
                "DEN ROJDENIA " + dr + '\'' + "\n" +
                "FAMILIA OTCHESTVO " + fo + '\'' + "\n" +
                "AGE " + age;

    }



    }







