public class StudentInfo
{
    public double gpa;
    public String name;
    public int sat;


    public StudentInfo(double gpa, String name, int sat)
    {
        this.gpa=gpa;
        this.name=name;
        this.sat=sat;
    }


    public StudentInfo(double gpa, String name){
        this.gpa=gpa;
        this.name=name;
    }


    public boolean passing()
    {
        return gpa >= 65;
    }


    public boolean satThreshold()
    {
        return sat>=1490;
    }


   public double gpaConvert() {
    
    int[] thresholds = {93, 90, 87, 83, 80, 77, 73, 70};
    double[] gpaValues = {4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7};


    for (int i = 0; i < thresholds.length; i++) {
        if (gpa >= thresholds[i]) {
            return gpaValues[i];
        }
    }

    return 1.3;
}

    public void Columbia() {
        if (gpaConvert() == 4.0) {
            System.out.println("Your GPA is the average Columbia GPA!");
        } else if (gpaConvert() > 4.0) {
            System.out.println("Your GPA is above the average Columbia GPA.");
        } else {
            System.out.println("Your GPA is below the average Columbia GPA");
        }
        if (sat == 1500) {
            System.out.println("Your SAT is the average Columbia SAT.");
        } else if (sat > 1500) {
            System.out.println("Your SAT is above the Columbia SAT average.");
        } else {
            System.out.println("Your SAT is below the Columbia SAT average.");
        }
    }

    public void Cornell() {
        if (gpaConvert() == 4.0) {
            System.out.println("Your GPA is the average Cornell GPA!");
        } else if (gpaConvert() > 4.0) {
            System.out.println("Your GPA is above the average Cornell GPA.");
        } else {
            System.out.println("Your GPA is below the average Cornell GPA");
        }
        if (sat == 1480) {
            System.out.println("Your SAT is the average Cornell SAT.");
        } else if (sat > 1480) {
            System.out.println("Your SAT is above the Cornell SAT average.");
        } else {
            System.out.println("Your SAT is below the Cornell SAT average.");
        }
    }

    public void Fordham() {
        if (gpaConvert() == 3.7) {
            System.out.println("Your GPA is the average Fordham GPA!");
        } else if (gpaConvert() > 3.7) {
            System.out.println("Your GPA is above the average Fordham GPA.");
        } else {
            System.out.println("Your GPA is below the average Fordham GPA");
        }
        if (sat == 1330) {
            System.out.println("Your SAT is the average Fordham SAT.");
        } else if (sat > 1330) {
            System.out.println("Your SAT is above the Fordham SAT average.");
        } else {
            System.out.println("Your SAT is below the Fordham SAT average.");
        }
    }

    public void UConn() {
        if (gpaConvert() == 3.6) {
            System.out.println("Your GPA is the average UConn GPA!");
        } else if (gpaConvert() > 3.6) {
            System.out.println("Your GPA is above the average UConn GPA.");
        } else {
            System.out.println("Your GPA is below the average UConn GPA");
        }
        if (sat == 1310) {
            System.out.println("Your SAT is the average UConn SAT.");
        } else if (sat > 1310) {
            System.out.println("Your SAT is above the UConn SAT average.");
        } else {
            System.out.println("Your SAT is below the UConn SAT average.");
        }
    }

    public void CUNYCityCollege() {
        if (gpaConvert() == 3.3) {
            System.out.println("Your GPA is the average CUNY City College GPA!");
        } else if (gpaConvert() > 3.3) {
            System.out.println("Your GPA is above the average CUNY City College GPA.");
        } else {
            System.out.println("Your GPA is below the average CUNY City College GPA");
        }
        if (sat == 1170) {
            System.out.println("Your SAT is the average CUNY City College SAT.");
        } else if (sat > 1170) {
            System.out.println("Your SAT is above the CUNY City College SAT average.");
        } else {
            System.out.println("Your SAT is below the CUNY City College SAT average.");
        }
    }

    public void SUNYBuffaloState() {
        if (gpaConvert() == 3.1) {
            System.out.println("Your GPA is the average SUNY Buffalo State GPA!");
        } else if (gpaConvert() > 3.1) {
            System.out.println("Your GPA is above the average SUNY Buffalo State GPA.");
        } else {
            System.out.println("Your GPA is below the average SUNY Buffalo State GPA");
        }
        if (sat == 1070) {
            System.out.println("Your SAT is the average SUNY Buffalo State SAT.");
        } else if (sat > 1070) {
            System.out.println("Your SAT is above the SUNY Buffalo State SAT average.");
        } else {
            System.out.println("Your SAT is below the SUNY Buffalo State SAT average.");
        }
    }
}



