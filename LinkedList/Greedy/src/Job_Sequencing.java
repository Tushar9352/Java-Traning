import java.util.*;
public class Job_Sequencing{
    static class Job{
        int id;
        int deadline;
        int profit;
         public Job(int id,int deadline,int profit){
            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={ { 4,20},{1,10},{1,40},{1,30} };
        ArrayList<Job>jobs  = new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(Obj1,Obj2)->Obj2.profit-Obj1.profit);
        ArrayList<Integer> sequence = new ArrayList<>();
        int time=0;
        for (int i = 0; i < jobs.size(); i++) {
           Job currentJob = jobs.get(i);
              if(currentJob.deadline>time){
                sequence.add(currentJob.id);
                time++;
              }
        }
        System.out.println("Job Sequence: " + sequence);
        for (int i = 0; i < sequence.size(); i++) {
            System.out.println(sequence.get(i)+" ");
        }
        System.out.println();
    }
}