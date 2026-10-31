def classroom_sheet(student, subject):
    grade = []
    for row in range(student):
        grade.append([0] * subject)

    for count in range(len(grade)):
        counter = 0
        while counter < len(grade[count]):
            print(f"Entering for Student {count + 1}")
            subject_score = int(input(f"Enter score for Subject {counter + 1}")
            
            if subject_score >= 1 and subject_score <= 100:
                grade[count][counter] = subject_score
                counter += 1
                print("Saving>>>>>>>>>>>>>>>>>>>>>>>>")
                print("Saved successfully")
                print()
            else:
                print("Invalid Input, Try again")
    return grade


def each_student_total(grade):
    total_score = [0] * len(grade)

    for count in range(len(grade)):
        total = 0
        for counter in range(len(grade[count])):
            total += grade[count][counter]
        total_score[count] = total

    return total_score


def each_student_average(grade):
    average_score = [0.0] * len(grade)

    for count in range(len(grade)):
        total = 0
        for counter in range(len(grade[count])):
            total += grade[count][counter]
        average_score[count] = (total * 1.0) / len(grade[count])

    return average_score


def position_index(scores):
    positions = [0] * len(scores)

    for count in range(len(scores)):
        position = 0
        for counter in range(len(scores)):
            if scores[counter] > scores[count]:
                position += 1
        positions[count] = position + 1
    return positions


def highest_subject_score(grade, subject):
    highest = grade[0][subject]

    for count in range(len(grade)):
        if grade[count][subject] > highest:
            highest = grade[count][subject]
    return highest


def highest_student(grade, subject):
    highest = 0

    for count in range(len(grade)):
        if grade[count][subject] > grade[highest][subject]:
            highest = count
    return highest + 1


def lowest_subject_score(grade, subject):
    lowest = grade[0][subject]

    for count in range(len(grade)):
        if grade[count][subject] < lowest:
            lowest = grade[count][subject]
    return lowest


def lowest_student(grade, subject):
    lowest = 0

    for count in range(len(grade)):
        if grade[count][subject] < grade[lowest][subject]:
            lowest = count

    return lowest + 1


def subject_total(grade, subject):
    total = 0

    for count in range(len(grade)):
        total += grade[count][subject]
    return total


def subject_average(grade, subject):

    return (subject_total(grade, subject) * 1.0) / len(grade)


def number_of_passes(grade, subject):
    passes = 0

    for count in range(len(grade)):
        if grade[count][subject] >= 50:
            passes += 1
    return passes


def number_of_fails(grade, subject):
    fails = 0

    for count in range(len(grade)):
        if grade[count][subject] < 50:
            fails += 1
    return fails


def best_graduating_student(grade):

    total = each_student_total(grade)
    best = 0

    for count in range(1, len(total)):
        if total[count] > total[best]:
            best = count
    return best + 1


def worst_graduating_student(grade):

    total = each_student_total(grade)
    worst = 0

    for count in range(1, len(total)):
        if total[count] < total[worst]:
            worst = count
    return worst + 1


def highest_total(grade):

    total = each_student_total(grade)
    highest = total[0]

    for count in range(1, len(total)):
        if total[count] > highest:
            highest = total[count]
    return highest


total_students = int(input("How many students do you have?"))

total_subjects = int(input("How many subjects do they offer?"))

print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
print("Saved successfully")

student_grade = classroom_sheet(total_students, total_subjects)
total = each_student_total(student_grade)
average = each_student_average(student_grade)
position = position_index(total)

print("=" * 150)
print("STUDENT \t", end="")
for count in range(1, total_subjects + 1):
    print(f"SUB{count}\t", end="")
print("TOTAL\t", end="")
print("AVG\t", end="")
print("POS\n", end="")
print("=" * 150)

for count in range(total_students):
    print(f"Student{count + 1}\t", end="")

    for counter in range(total_students):
        print(f"{student_grade[count][counter]}\t", end="")

    print(f"{total[count]}", end="\t")

    print(f"{average[count]}", end="\t")

    print(f"{position[count]}", end="\t")

    print()

print("=" * 150)
print()
print("=" * 150)

print("SUBJECT SUMMARY")

for count in range(len(student_grade[0])):

    print(f"\nSubject {count + 1}")
    print(f"Highest scoring student is : Student {highest_student(student_grade, count)}")
    print(f"Lowest scoring student is : Student {lowest_student(student_grade, count)}")
    print(f"Total score: {subject_total(student_grade, count)}")
    print(f"Average score: {subject_average(student_grade, count)}")
    print(f"Number of passes: {number_of_passes(student_grade, count)}")
    print(f"Number of fails: {number_of_fails(student_grade, count)}")

