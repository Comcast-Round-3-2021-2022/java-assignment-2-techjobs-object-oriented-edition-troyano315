package org.launchcode.techjobs.oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));

        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(job1);
        jobs.add(job2);
        jobs.add(job3);

        for (Job job : jobs){
            System.out.println(job);
        }

//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//
//        String jobString = '\n' + "ID: " + job1.getId() + "\n" +  "Name: " + job1.getName() + "\n" +  "Employer: " + job1.getEmployer() + "\n" +  "Location: " + job1.getLocation() + "\n" +  "Position Type: " + job1.getPositionType() + "\n" +  "Core Competency: " + job1.getCoreCompetency() + '\n';
//        String test = "test";
//
//        System.out.println(jobString);
//        System.out.println(job1.getId());

    }

}
