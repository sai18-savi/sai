#include <stdio.h>
int main() {
    int n, i;
    int bt[20], wt[20], tat[20];
    float avg_wt = 0, avg_tat = 0;
    printf("Enter number of processes: ");
    scanf("%d", &n);	
    printf("Enter burst time for each process:\n");
    for (i = 0; i < n; i++) {
        printf("P[%d]: ", i + 1);
        scanf("%d", &bt[i]);
    }
    wt[0] = 0;  // waiting time for first process is 0

    // calculate waiting time
    for (i = 1; i < n; i++) {
        wt[i] = wt[i - 1] + bt[i - 1];
    }
    for (i = 0; i < n; i++) {
        tat[i] = wt[i] + bt[i];
        avg_wt += wt[i];
        avg_tat += tat[i];
    }printf("\nProcess\tBT\tWT\tTAT");
    for (i = 0; i < n; i++) {
        printf("\nP[%d]\t%d\t%d\t%d", i + 1, bt[i], wt[i], tat[i]);
    }
    printf("\n\nAverage Waiting Time = %.2f", avg_wt / n);
    printf("\nAverage Turnaround Time = %.2f\n", avg_tat / n);
    return 0;
}
