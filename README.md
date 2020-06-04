# issue_ktlint_gradle_360
SSCCE https://github.com/JLLeitschuh/ktlint-gradle/issues/360

Custom rule is emitting an error containing a generic form "List<Int>", the expected HTML report should display

    Error message contains a generic type like List<Int>
    
But actually it displays

    Error message contains a generic type like List
    
'<' and '>' should be escaped for web format (&lt; / &gt;)
