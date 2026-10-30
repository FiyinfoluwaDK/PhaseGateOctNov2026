def classroom_sheet(students, subjects):
    grade = []
    for student in range(students):
        for subject in range(subjects):
            grade[student].append(subject)

def student_insert(grade, number_of_student):
    for count in range(1, number_of_student + 1):
        grade[count].insert(0, "Student "+ count)
        
    return grade

def total_score_append(grade):
    for count in range(len(grade)):
        grade[count].append(\t sum(grade[count]))
    
    return grade
    
def t

