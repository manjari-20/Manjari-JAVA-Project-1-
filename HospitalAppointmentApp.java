// Doctor Class
class Doctor {
    int doctorId;
    String name;
    String specialization;

    Doctor(int doctorId, String name, String specialization) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
    }
}

// Patient Class
class Patient {
    int patientId;
    String name;
    int age;

    Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
}

// Appointment Class
class Appointment {
    Doctor doctor;
    Patient patient;
    String timeSlot;
    String status;

    Appointment(Doctor doctor, Patient patient, String timeSlot) {
        this.doctor = doctor;
        this.patient = patient;
        this.timeSlot = timeSlot;
        this.status = "Booked";
    }
}

// Appointment Manager Class
class AppointmentManager {
    Appointment[] appointments = new Appointment[10];
    int count = 0;

    boolean isSlotAvailable(Doctor doctor, String timeSlot) {
        for (int i = 0; i < count; i++) {
            if (appointments[i].doctor.doctorId == doctor.doctorId &&
                appointments[i].timeSlot.equals(timeSlot) &&
                appointments[i].status.equals("Booked")) {
                return false;
            }
        }
        return true;
    }

    void bookAppointment(Doctor doctor, Patient patient, String timeSlot) {
        if (isSlotAvailable(doctor, timeSlot)) {
            appointments[count++] = new Appointment(doctor, patient, timeSlot);
            System.out.println("Appointment booked successfully!");
        } else {
            System.out.println("Error: Slot not available!");
        }
    }

    void cancelAppointment(int patientId, String timeSlot) {
        for (int i = 0; i < count; i++) {
            if (appointments[i].patient.patientId == patientId &&
                appointments[i].timeSlot.equals(timeSlot) &&
                appointments[i].status.equals("Booked")) {

                appointments[i].status = "Cancelled";
                System.out.println("Appointment cancelled successfully!");
                return;
            }
        }
        System.out.println("Appointment not found!");
    }

    void displayAppointments() {
        for (int i = 0; i < count; i++) {
            System.out.println("
Doctor: " + appointments[i].doctor.name);
            System.out.println("Patient: " + appointments[i].patient.name);
            System.out.println("Time: " + appointments[i].timeSlot);
            System.out.println("Status: " + appointments[i].status);
        }
    }
}

// Main Class
public class HospitalAppointmentApp {
    public static void main(String[] args) {

        Doctor d1 = new Doctor(1, "Dr. Sharma", "Cardiologist");
        Doctor d2 = new Doctor(2, "Dr. Verma", "Dermatologist");

        Patient p1 = new Patient(101, "Rahul", 22);
        Patient p2 = new Patient(102, "Anjali", 20);

        AppointmentManager manager = new AppointmentManager();

        System.out.println("Booking appointment...");
        manager.bookAppointment(d1, p1, "10:00 AM");

        manager.displayAppointments();

        System.out.println("
Trying same slot...");
        manager.bookAppointment(d1, p2, "10:00 AM");

        System.out.println("
Cancelling...");
        manager.cancelAppointment(101, "10:00 AM");

        manager.displayAppointments();
    }
}