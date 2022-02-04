import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.util.LinkedList;
import java.util.List;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

class CarModel extends JFrame implements ActionListener {
    // Components of the Form
    private Container c;
    private JLabel pageitle;
    private JLabel brand;
    private JTextField carBrandName;
    private JLabel carModel;
    private JTextField carModelName;
    private JLabel color;
    private JTextField carColor;
    private JLabel year;
    private JComboBox modelYear;
    private JLabel engineNumber;
    private JTextField carEngineNumber;
    private JLabel seatsNumber;
    private JTextField carSeats;
    private JLabel license;
    private JTextField carLicense;
    private JLabel ownerName;
    private JTextField ownerNameField;
    private JLabel ownerPhone;
    private JTextField ownerPhoneNumber;
    private JLabel ownerEmail;
    private JTextField ownerEmailaddress;
    private JLabel driverLicense;
    private JTextField driverLicenseNumber;
    private JLabel ssn;
    private JTextField ssnField;
    private JLabel ownerAddress;
    private JTextField ownerAddressField;
    private JLabel warrantyYear;
    private JTextField warrantyYearField;
    private JButton sub;
    private JLabel res;


    private List<ServiceRecord> serviceRecordList;
    private JButton addServiceRecord;
    private JLabel serviceDate;
    private JTextField serviceDateField;
    private JLabel serviceCost;
    private JTextField serviceCostField;
    private JLabel serviceRecords;
    private JTable serviceRecordsTable;
    

    public void saveServiceRecords(ServiceRecord serviceRecord) {
        this.serviceRecordList.add(serviceRecord);
    }


    private JLabel image;
    private JTextField imageUrl;
    private JButton addImageBtn;



    private String years[]
            = { "1991", "1992", "1993", "1994",
            "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019", "2020", "2021", "2022" };

    // constructor, to initialize the components
    // with default values.
    public CarModel()
    {
        this.serviceRecordList = new LinkedList<>();
        
        setTitle("Car Profile");
        setBounds(80, 80, 1300, 1000);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(true);

        c = getContentPane();
        c.setLayout(null);

        pageitle = new JLabel("Car Profile");
        pageitle.setFont(new Font("Times New Roman", Font.BOLD, 40));
        pageitle.setSize(300, 50);
        pageitle.setLocation(500, 15);
        c.add(pageitle);

        brand = new JLabel("Car Brand");
        brand.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        brand.setSize(150, 20);
        brand.setLocation(100, 100);
        c.add(brand);

        carBrandName = new JTextField();
        carBrandName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        carBrandName.setSize(150, 20);
        carBrandName.setLocation(250, 100);
        c.add(carBrandName);

        carModel = new JLabel("Car Model");
        carModel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        carModel.setSize(150, 20);
        carModel.setLocation(100, 150);
        c.add(carModel);

        carModelName = new JTextField();
        carModelName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        carModelName.setSize(150, 20);
        carModelName.setLocation(250, 150);
        c.add(carModelName);

        color = new JLabel("Color");
        color.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        color.setSize(150, 20);
        color.setLocation(100, 200);
        c.add(color);

        carColor= new JTextField();
        carColor.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        carColor.setSize(150, 20);
        carColor.setLocation(250, 200);
        c.add(carColor);

        year = new JLabel("Year");
        year.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        year.setSize(150, 20);
        year.setLocation(100, 250);
        c.add(year);

        modelYear = new JComboBox(years);
        modelYear.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        modelYear.setSize(100, 20);
        modelYear.setLocation(250, 250);
        c.add(modelYear);

        engineNumber = new JLabel("Engine Number");
        engineNumber.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        engineNumber.setSize(150, 20);
        engineNumber.setLocation(100, 300);
        c.add(engineNumber);

        carEngineNumber = new JTextField();
        carEngineNumber.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        carEngineNumber.setSize(150, 20);
        carEngineNumber.setLocation(250, 300);
        c.add(carEngineNumber);

        seatsNumber = new JLabel("Number of Seats");
        seatsNumber.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        seatsNumber.setSize(150, 20);
        seatsNumber.setLocation(100, 350);
        c.add(seatsNumber);
        

        carSeats = new JTextField();
        carSeats.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        carSeats.setSize(150, 20);
        carSeats.setLocation(250, 350);
        c.add(carSeats);

        license = new JLabel("License Plate Number");
        license.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        license.setSize(150, 20);
        license.setLocation(100, 400);
        c.add(license);

        carLicense = new JTextField();
        carLicense.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        carLicense.setSize(150, 20);
        carLicense.setLocation(250, 400);
        c.add(carLicense);

        ownerName = new JLabel("Owner's Name");
        ownerName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ownerName.setSize(150, 20);
        ownerName.setLocation(100, 450);
        c.add(ownerName);

        ownerNameField = new JTextField();
        ownerNameField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ownerNameField.setSize(150, 20);
        ownerNameField.setLocation(250, 450);
        c.add(ownerNameField);

        ownerPhone = new JLabel("Phone Number");
        ownerPhone.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ownerPhone.setSize(150, 20);
        ownerPhone.setLocation(100, 500);
        c.add(ownerPhone);

        ownerPhoneNumber = new JTextField();
        ownerPhoneNumber.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ownerPhoneNumber.setSize(150, 20);
        ownerPhoneNumber.setLocation(250, 500);
        c.add(ownerPhoneNumber);

        ownerEmail = new JLabel("e-mail Address");
        ownerEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ownerEmail.setSize(150, 20);
        ownerEmail.setLocation(100, 550);
        c.add(ownerEmail);

        ownerEmailaddress = new JTextField();
        ownerEmailaddress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ownerEmailaddress.setSize(150, 20);
        ownerEmailaddress.setLocation(250, 550);
        c.add(ownerEmailaddress);

        driverLicense = new JLabel("Driver's License No.");
        driverLicense.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        driverLicense.setSize(150, 20);
        driverLicense.setLocation(100, 600);
        c.add(driverLicense);

        driverLicenseNumber = new JTextField();
        driverLicenseNumber.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        driverLicenseNumber.setSize(150, 20);
        driverLicenseNumber.setLocation(250, 600);
        c.add(driverLicenseNumber);

        ssn = new JLabel("SSN");
        ssn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ssn.setSize(150, 20);
        ssn.setLocation(1000, 100);
        c.add(ssn);

        ssnField = new JTextField();
        ssnField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ssnField.setSize(150, 20);
        ssnField.setLocation(1120, 100);
        c.add(ssnField);

        ownerAddress = new JLabel("Owner's Address");
        ownerAddress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ownerAddress.setSize(150, 20);
        ownerAddress.setLocation(1000, 150);
        c.add(ownerAddress);

        ownerAddressField = new JTextField();
        ownerAddressField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        ownerAddressField.setSize(150, 20);
        ownerAddressField.setLocation(1120, 150);
        c.add(ownerAddressField);

        warrantyYear = new JLabel("Warranty Year");
        warrantyYear.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        warrantyYear.setSize(150, 20);
        warrantyYear.setLocation(1000, 200);
        c.add(warrantyYear);

        warrantyYearField = new JTextField();
        warrantyYearField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        warrantyYearField.setSize(150, 20);
        warrantyYearField.setLocation(1120, 200);
        c.add(warrantyYearField);

        // service
        serviceDate = new JLabel("Service Date");
        serviceDate.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        serviceDate.setSize(150, 20);
        serviceDate.setLocation(1000, 300);

        serviceDateField = new JTextField();
        serviceDateField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        serviceDateField.setSize(150, 20);
        serviceDateField.setLocation(1120, 300);

        serviceCost = new JLabel("Service Cost");
        serviceCost.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        serviceCost.setSize(150, 20);
        serviceCost.setLocation(1000, 350);

        serviceCostField = new JTextField();
        serviceCostField.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        serviceCostField.setSize(150, 20);
        serviceCostField.setLocation(1120, 350);


        addServiceRecord = new JButton("Add Service Records");
        addServiceRecord.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        addServiceRecord.setSize(150, 20);
        addServiceRecord.setLocation(800, 700);
        addServiceRecord.addActionListener(this);
        c.add(addServiceRecord);
        //service record ends
        

        //image url
        image = new JLabel("Image Url");
        image.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        image.setSize(150, 20);
        image.setLocation(1000, 250);
        c.add(image);

        imageUrl = new JTextField();
        imageUrl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        imageUrl.setSize(150, 20);
        imageUrl.setLocation(1120, 250);
        c.add(imageUrl);

        addImageBtn = new JButton("Add Image");
        addImageBtn.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        addImageBtn.setSize(150, 20);
        addImageBtn.setLocation(650, 700);
        addImageBtn.addActionListener(this);
        c.add(addImageBtn);
        /// image url ends

        sub = new JButton("Submit");
        sub.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        sub.setSize(150, 20);
        sub.setLocation(400, 700);
        sub.addActionListener(this);
        c.add(sub);


        

        res = new JLabel("");
        res.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        res.setSize(500, 25);
        res.setLocation(900, 500);
        c.add(res);


        setVisible(true);
    }

    public void showError(String error){
        JLabel errorText = new JLabel(error);
        errorText.setSize(100, 100);
        errorText.setLocation(550, 450);
        errorText.setForeground(Color.red);
        c.add(errorText);
        c.repaint();
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            if(carBrandName.getText().length() == 0){
                showError("Car Brand Name is required");
                return;
            }else if(carEngineNumber.getText().length() == 0){
                showError("Car Engine Number is required");
                return;
            }else if(imageUrl.getText().length() == 0){
                showError("Image Url is required");
                return;
            }else{
                // show all the details here
                res.setText("Registered Successfully...");
            }
        }
        else if(e.getSource() == addImageBtn){
            try {
                URL url = new URL(imageUrl.getText());
                Image image = ImageIO.read(url);
                JLabel labelImg = new JLabel(new ImageIcon(image));
                labelImg.setSize(300, 300);
                labelImg.setLocation(500, 100);
                c.add(labelImg);
                c.repaint();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else if(e.getSource() == addServiceRecord){
            if(this.serviceRecordList.size() == 0 && 
                serviceDateField.getText().length() == 0 && 
                serviceCostField.getText().length() == 0){
                c.add(serviceDate);
                c.add(serviceDateField);
                c.add(serviceCost);
                c.add(serviceCostField);
                c.repaint();
            }
            else if(serviceDateField.getText() != "" && serviceCostField.getText() != ""){
                ServiceRecord serviceRecord = new ServiceRecord();
                serviceRecord.setServiceCost(Float.parseFloat(serviceCostField.getText()));
                serviceRecord.setServiceDate(serviceDateField.getText());
                this.saveServiceRecords(serviceRecord);


                if(serviceRecordsTable != null){
                    c.remove(serviceRecordsTable);
                }
                // Initializing the JTable
                serviceRecordsTable = new JTable();
                DefaultTableModel dtm = new DefaultTableModel(0, 0);
                String header[] = new String[] { "Service Date", "Service Cost" };
                dtm.setColumnIdentifiers(header);
                serviceRecordsTable.setModel(dtm);

                // add row dynamically into the table
                for (int count = 0; count < this.serviceRecordList.size(); count++) {
                    dtm.addRow(new Object[] { this.serviceRecordList.get(count).serviceDate, this.serviceRecordList.get(count).serviceCost.toString()});
                }

                serviceRecordsTable.setSize(200, this.serviceRecordList.size() * 25);
                serviceRecordsTable.setLocation(500,  550);
                c.add(serviceRecordsTable);

                JLabel serviceDateLabel = new JLabel("Service Date");
                JLabel serviceCostLabel = new JLabel("Service Cost");

                serviceDateLabel.setSize(100, 100);
                serviceDateLabel.setLocation(550, 450);
                serviceDateLabel.setForeground(Color.green);

                serviceCostLabel.setSize(100, 100);
                serviceCostLabel.setLocation(600, 450);
                serviceCostLabel.setForeground(Color.green);

                c.add(serviceDateLabel);
                c.add(serviceCostLabel);
                c.repaint();

                String def = "";
                serviceDateField.setText(def);
                serviceCostField.setText(def);
                c.repaint();
            }
        }
    }
}

// Driver Code
class CarRegistration {

    public static void main(String[] args) throws Exception
    {
        CarModel f = new CarModel();
    }
}