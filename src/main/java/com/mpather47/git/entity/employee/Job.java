package com.mpather47.git.entity.employee;

import java.io.Serializable;

/**
 * @authour @Pilisa
 * Decription: Entity for Position

 */

public class Job implements Serializable {

    private String jobTittle;
    private Job(){}

    private Job(Builder builder) {
        this.jobTittle =builder.jobTittle;

    }

    public Job(Position.Builder builder) {
    }


    public String getJobTittle() {
        return jobTittle;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobTittle='" + jobTittle + '\'' +
                '}';
    }
    public static class Builder{
        private String jobTittle;

        public Builder setjobTittle(String  jobTittle) {
            this.jobTittle = jobTittle;
            return this;
        }

        public Builder copy(Job job){
            this.jobTittle =job.jobTittle;
            return this;
        }
        public Job build(){
            return new Job (this);
        }


    }

}

