package Util;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Point;
import java.text.DecimalFormat;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CenterTextMode;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.RingPlot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.chart.ui.HorizontalAlignment;
import org.jfree.chart.ui.RectangleInsets;

public class RingChartController {

    private double percent;

    public RingChartController(double percent) {
        this.percent = percent;
    }

    private PieDataset createDataset() {
        DefaultPieDataset defaultPieDataset = new DefaultPieDataset();
        defaultPieDataset.setValue("A", new Double(this.percent));
        defaultPieDataset.setValue("B", new Double(1-this.percent));
        return (PieDataset) defaultPieDataset;
    }

    private JFreeChart createChart(PieDataset paramPieDataset) {
        RingPlot ringPlot = new RingPlot(paramPieDataset);
        ringPlot.setCenterTextMode(CenterTextMode.VALUE);
        ringPlot.setCenterTextFont(new Font("SansSerif", 1, 24));
        ringPlot.setCenterTextColor(Color.LIGHT_GRAY);
        ringPlot.setCenterTextFormatter(new DecimalFormat("0.0%"));
        JFreeChart jFreeChart = new JFreeChart("", JFreeChart.DEFAULT_TITLE_FONT, (Plot) ringPlot, false);
        jFreeChart.setBackgroundPaint(new Color(45, 45, 45));
        TextTitle textTitle = jFreeChart.getTitle();
        textTitle.setHorizontalAlignment(HorizontalAlignment.LEFT);
        textTitle.setPaint(new Color(240, 240, 240));
        textTitle.setFont(new Font("Arial", 1, 26));
        ringPlot.setBackgroundPaint(null);
        ringPlot.setOutlineVisible(false);
        ringPlot.setLabelGenerator(null);
        ringPlot.setSectionPaint("A", new Color(72, 136, 123));
        ringPlot.setSectionPaint("B", new Color(100, 100, 100));
        ringPlot.setSectionDepth(0.05D);
        ringPlot.setSectionOutlinesVisible(false);
        ringPlot.setShadowPaint(null);
        return jFreeChart;
    }

    public ChartPanel createPanel() {
        JFreeChart jFreeChart = createChart(createDataset());
        jFreeChart.setPadding(new RectangleInsets(4.0D, 8.0D, 2.0D, 2.0D));
        ChartPanel chartPanel = new ChartPanel(jFreeChart);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setPreferredSize(new Dimension(600, 300));
        return chartPanel;
    }

}
