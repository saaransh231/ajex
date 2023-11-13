package Basics;

public class EmployeeDetails {

        int id;

        String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public EmployeeDetails(int id, String name) {
            this.id = id;
            this.name = name;
        }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

