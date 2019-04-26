# 371-Slotted-ALOHA
Simulates Slotted-ALOHA to find the practical efficiency of the algorithm.

### Assumptions
The simulation is run with 6 nodes (N). <br>
Each node transmits a data frame with a probability of 0.3 (p = 0.3). <br>

Probability was calculated using a random number generator. <br>
Nodes will always have data available for transmission. (i.e. Once a node
    successfully transmitted a data frame, it will immediately have another
    frame to transmit.)
### Findings
The success rate was significantly higher than the estimated success. <br>
The estimated success rate using the theoretical model: (𝑁𝑝(1−𝑝)^(𝑁−1))
with N = 6 and P = 0.3 is **30.2526%**. <br>
<br>
After ALOHA running over five million slots, the actual success rate was around **43%**.
<br>
This is much higher than the theoretical model; the assumptions may have
inflated the success rate.

### Context
Part of a project completed for CMPT371: Data Communications/Networking
