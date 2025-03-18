import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MwangazaApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new HomeScreen());
    }
}

class HomeScreen extends JFrame {
    public HomeScreen() {
        setTitle("Mwangaza: Biomass Analysis & Clean Energy System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JLabel titleLabel = new JLabel("Mwangaza: Clean Energy Companion", SwingConstants.CENTER);
        add(titleLabel);

        JButton scanButton = new JButton("Scan Biomass");
        scanButton.addActionListener(e -> new ScanScreen());
        add(scanButton);

        JButton resultsButton = new JButton("View Scan Results");
        resultsButton.addActionListener(e -> new ResultsScreen());
        add(resultsButton);

        JButton dashboardButton = new JButton("Dashboard");
        dashboardButton.addActionListener(e -> new DashboardScreen());
        add(dashboardButton);

        setVisible(true);
    }
}

class ScanScreen extends JFrame {
    public ScanScreen() {
        setTitle("Biomass Scan");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        JLabel scanLabel = new JLabel("Center biomass in frame...", SwingConstants.CENTER);
        add(scanLabel);

        JButton scanButton = new JButton("Scan");
        scanButton.addActionListener(e -> new ResultsScreen());
        add(scanButton);

        setVisible(true);
    }
}

class ResultsScreen extends JFrame {
    public ResultsScreen() {
        setTitle("Scan Results");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        JLabel energyLabel = new JLabel("Energy Potential: 45 kWh", SwingConstants.CENTER);
        add(energyLabel);

        JLabel compositionLabel = new JLabel("Composition: Cellulose 45%, Lignin 30%, Other 25%", SwingConstants.CENTER);
        add(compositionLabel);

        JButton guideButton = new JButton("View Guides");
        add(guideButton);

        setVisible(true);
    }
}

class DashboardScreen extends JFrame {
    public DashboardScreen() {
        setTitle("Mwangaza Dashboard");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        JLabel titleLabel = new JLabel("Mwangaza Dashboard", SwingConstants.CENTER);
        add(titleLabel);

        JLabel inventoryLabel = new JLabel("Biomass Inventory", SwingConstants.CENTER);
        add(inventoryLabel);

        JLabel forecastLabel = new JLabel("Energy Production Forecast", SwingConstants.CENTER);
        add(forecastLabel);

        setVisible(true);
    }
}
