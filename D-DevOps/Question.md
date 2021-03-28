# Question 1 
What is the difference between a VM and a container? Give an example of each, perhaps from some work you have previously done?

A full virtualized system gets its own set of resources allocated to it, and does minimal sharing. You get more isolation, but it is much heavier (requires more resources).
With Docker you get less isolation, but the containers are lightweight (require fewer resources). So you could easily run thousands of containers on a host, 
# Question 2
You might have heard about gocd, cfengine, ansible and puppet? In a few sentences, describe a
situation when you have worked with each of those, or similar software? What problem were you
trying to solve, and how did the software help?

Ansible: 
I have worked closely with DevOps engineer in my previous organization where they have used Ansible for patching 100's of servers, And we have used Ansible for performing pre and post-task such as stopping tomcat instances before the patch and restarting it once the patching is done, etc.

Jenkins: 
Created CI CD for Spring boot based application to deploy applications in cloud foundry instances.
Created CI CD for AWS lambda based application to deploy the application file into s3 and deploy it in AWS lambda. 



# Question 3
Give 3 examples of what you think could be easy wins for us to reduce AWS compute costs (or
another cloud technology you are familiar with)? Bonus: Have you ever had any experience of
monitoring and reducing cloud computing costs, briefly explain what you did?

An example where we can easily implement cost reduction. 

1. Backup your data in S3 and not EBS, Choosing appropriate s3 storage such as (S3 Glacier) will help reduce the cost.
2. Identifying EC2 with low utilization and right-sizing them and scheduling downtime for service (E.g at night time)
3. To use AWS Lambda, fargate to reduce compute cost instead of using EC2. 

Experience:

1. In my project, I have data engineered task of copying Terabytes of data into EC2 for Data scientists to computation and analysis.
2. Identified resources in my project that does not require 24/7 uptime and scheduled downtime accordingly
3. I have taken ownership of my project to decide if an application should be deployed on AWS lambda or Fargate. 

