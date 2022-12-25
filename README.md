# Undo Project
![](https://media.tenor.com/cF4jU_6_CnUAAAAi/piggy-regret.gif)

# Undo Project

The project implements above group admin that updates
platform of messages for group members.


## Authors

- [@ibrahim3999](https://github.com/ibrahim3999)
- [@Tairsal](https://github.com/Tairsal)





## Project Description
### API Interfaces:
 - [Sender](https://github.com/ibrahim3999/Ex1_oop/blob/main/src/main/java/api/Member.java)
 - [Member](https://github.com/ibrahim3999/Ex1_oop/blob/main/src/main/java/api/Sender.java)
 
### Group Admin
A class that implements the Sender Interface also include Insert,
Delete and Append Methods.

- [Methods](https://github.com/ibrahim3999/Ex1_oop/blob/main/src/main/java/observer/GroupAdmin.java)

### Concrete Member
A class that implements the Member Interface and extends Group Admin also include update platform
for any changes in the Group Admin.

- [update platform](https://github.com/ibrahim3999/Ex1_oop/blob/main/src/main/java/observer/ConcreteMember.java)

### UndoAbleStringBuilder
Class that include A stack Memory (without limit) for any change
 in the message.

- [Allocate Memory for Changes](https://github.com/ibrahim3999/Ex1_oop/blob/main/src/main/java/observer/UndoableStringBuilder.java)
