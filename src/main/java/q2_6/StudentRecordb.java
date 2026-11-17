package q2_6;

public record StudentRecordb(String name, int age, String college) {
    
    public void print() {
        System.out.println(name + ", " + age + ", " + college);
    }
}