package Challenges.javaSort;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    public int compareTo(Student s){
        int result = Double.compare(cgpa, s.cgpa);
        if(result != 0 ){
            return -result;
        }
        result = fname.compareTo(s.fname);
        if (result != 0){
            return result;
        }
        return Integer.compare(id, s.id);
    }
}
