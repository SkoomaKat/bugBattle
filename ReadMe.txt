
BugBattle is a modular program that allows for creation of text based adventures in the bug world. Please see the Class
and Sequence diagrams available in the resources folder for a more in-depth view of how the program works before
attempting to add functionality to this program. ( Particularly bugGame_mainGameLoop_CD.puml file )

Adding functionality -

    To add functionality to this program the first step is to decide what you want to add. Additional Story Branches
    can be added with ease by adding the choice to the Choice enum, and creating a new class that implements the
    StoryBranch interface.

    When the player chooses the option that aligns with the Choice you added, the play() method of your Story Branch
    class will run. The only requirement is that your play method return an updated PlayerData object back from play().

    Generally, you should try and only modify PlayerData fields that pertain directly to your StoryBranch/fields you
    add yourself, this way you can avoid conflict with data used in other branches, though sometimes it may be necessary
    to change values used by multiple branches (ex. spending/earning money).

