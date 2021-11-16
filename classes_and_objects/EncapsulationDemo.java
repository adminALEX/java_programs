package classes_and_objects;

class Employee{
    int eid;
    String name;
    String shift;
    static int world_ranking;

    static{
        world_ranking = 4;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }
    public int getEid() {

        
        return eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getWorld_ranking() {
        return world_ranking;
    }
    public static void setWorld_ranking(int world_ranking) {
        Employee.world_ranking = world_ranking;
    }
    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEid(101);
        emp1.setName("Alex");
        emp1.setShift("FN");
        Employee emp2 = new Employee();
        emp2.setEid(102);
        emp2.setName("Justin");
        emp2.setShift("AN");
        Employee emp3 = new Employee();
        emp3.setEid(103);
        emp3.setName("Taylor");
        emp3.setShift("FN");
        System.out.print(emp1.getEid()+" ");
        System.out.print(emp1.getName()+" ");
        System.out.print(emp1.getShift()+" ");
        System.out.print(Employee.getWorld_ranking());
        System.out.println();
        System.out.print(emp2.getEid()+" ");
        System.out.print(emp2.getName()+" ");
        System.out.print(emp2.getShift()+" ");
        System.out.print(Employee.getWorld_ranking());
        System.out.println();
        System.out.print(emp3.getEid()+" ");
        System.out.print(emp3.getName()+" ");
        System.out.print(emp3.getShift()+" ");
        System.out.print(Employee.getWorld_ranking());
    }
    
}
