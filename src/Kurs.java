public class Kurs {
    String name;
    int age;
    String name1;
    int godvup;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setGodvup(int godvup) {
        this.godvup = godvup;
    }

    public String getName(String itKg) {
        return name;
    }

    public int getAge(int i) {
        return age;
    }

    public String getName1() {
        return name1;
    }

    @Override
    public String toString() {
        return
                "NAME  "+"\n" + name + '\''+"\n"+
                " NOMER " +"\n"+ age +"\n"+
                "UCHITEL " +"\n"+ name1 + '\'' +"\n"+
                "GOD VYPUSKA "+"\n" + godvup ;
    }



    }

