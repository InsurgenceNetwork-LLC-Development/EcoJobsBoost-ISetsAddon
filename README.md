# EcoJobsBoost-ISetsAddon
EcoJobs plugin is required

This addon allows you to boost the amount of experience gained when players are completing their jobs.

Using the below settings, the player will receive a 15% boost on the amount of job experience they earn. For instance, if they gained 150, they will receive 172.5.

```yaml
Boosts:
  - Namespace: MISC
    Type: Jobs
    Percent: true
    Settings:
      Boost_Amount: 15
```
