package org.primefaces.ultima.view;

import javax.annotation.PostConstruct;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean
public class ChartView implements Serializable {

    private LineChartModel lineModel1;
    private LineChartModel lineModel2;
    private BarChartModel barModel;
    private HorizontalBarChartModel horizontalBarModel;
    private PieChartModel pieModel1;
    private PieChartModel pieModel2;
    private Long comunicadoSim;
    private Long comunicadoNao;

    @PostConstruct
    public void init() {
        createLineModels();
        createBarModels();
        createPieModels();
    }

    public Long getComunicadoSim() {
        return comunicadoSim;
    }

    public void setComunicadoSim(Long comunicadoSim) {
        this.comunicadoSim = comunicadoSim;
    }

    public Long getComunicadoNao() {
        return comunicadoNao;
    }

    public void setComunicadoNao(Long comunicadoNao) {
        this.comunicadoNao = comunicadoNao;
    }

    
    public LineChartModel getLineModel1() {
        return lineModel1;
    }
    

    public LineChartModel getLineModel2() {
        return lineModel2;
    }

    public BarChartModel getBarModel() {
        return barModel;
    }

    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }

    public PieChartModel getPieModel1() {
        return pieModel1;
    }

    public PieChartModel getPieModel2() {
        return pieModel2;
    }

    private void createPieModels() {
        createPieModel1();
        createPieModel2();
    }

    private void createPieModel1() {
        pieModel1 = new PieChartModel();

        pieModel1.set("Brand 1", 540);
        pieModel1.set("Brand 2", 325);
        pieModel1.set("Brand 3", 702);
        pieModel1.set("Brand 4", 421);

        pieModel1.setTitle("Simple Pie");
        pieModel1.setLegendPosition("w");
    }

    private void createPieModel2() {
        pieModel2 = new PieChartModel();

        pieModel2.set("Brand 1", 540);
        pieModel2.set("Brand 2", 325);
        pieModel2.set("Brand 3", 702);
        pieModel2.set("Brand 4", 421);

        pieModel2.setTitle("Custom Pie");
        pieModel2.setLegendPosition("e");
        pieModel2.setFill(false);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(150);
    }

    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();

        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("Jan", 120);
        boys.set("Fev", 100);
        boys.set("Mar", 44);
        boys.set("Abr", 150);
        boys.set("Mai", 25);

        ChartSeries girls = new ChartSeries();
        girls.setLabel("Girls");
        girls.set("Jan", 52);
        girls.set("Fev", 60);
        girls.set("Mar", 110);
        girls.set("Abr", 135);
        girls.set("Mai", 120);
        model.setBarWidth(50);

        model.addSeries(boys);
        model.addSeries(girls);

        return model;
    }

    private void createBarModels() {
        createBarModel();
        createHorizontalBarModel();
    }

    private void createBarModel() {
        barModel = initBarModel();

        barModel.setTitle("Tempo Medio para Cominicado");
        barModel.setLegendPosition("ne");

        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Mês");
        
       

        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("QTD");
        yAxis.setMin(0);
        yAxis.setMax(200);
        
    }

    private void createHorizontalBarModel() {
        horizontalBarModel = new HorizontalBarChartModel();

        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set("2004", 50);
        boys.set("2005", 96);
        boys.set("2006", 44);
        boys.set("2007", 55);
        boys.set("2008", 25);

//        ChartSeries girls = new ChartSeries();
//        girls.setLabel("Girls");
//        girls.set("2004", 52);
//        girls.set("2005", 60);
//        girls.set("2006", 82);
//        girls.set("2007", 35);
//        girls.set("2008", 120);

        horizontalBarModel.addSeries(boys);
//        horizontalBarModel.addSeries(girls);

        horizontalBarModel.setTitle("Horizontal and Stacked");
        horizontalBarModel.setLegendPosition("e");
        horizontalBarModel.setStacked(true);

        Axis xAxis = horizontalBarModel.getAxis(AxisType.X);
        xAxis.setLabel("Births");
        xAxis.setMin(0);
        xAxis.setMax(200);

        Axis yAxis = horizontalBarModel.getAxis(AxisType.Y);
        yAxis.setLabel("Gender");
    }

    private void createLineModels() {
        lineModel1 = initLinearModel();
        lineModel1.setTitle("Tempo Medio para Cominicado");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);

        lineModel2 = initCategoryModel();
        lineModel2.setTitle("Comunicado x Não comunicados");
        lineModel2.setLegendPosition("e");
        lineModel2.setShowPointLabels(true);
        lineModel2.getAxes().put(AxisType.X, new CategoryAxis("Não comunicados"));
        yAxis = lineModel2.getAxis(AxisType.Y);
        yAxis.setLabel("Comunicados");
        yAxis.setMin(0);
        yAxis.setMax(200);
    }

    private LineChartModel initLinearModel() {
        LineChartModel model = new LineChartModel();

        LineChartSeries series1 = new LineChartSeries();
        series1.setLabel("Series 1");

        series1.set(1, 2);
        series1.set(2, 1);
        series1.set(3, 3);
        series1.set(4, 6);
        series1.set(5, 8);

        LineChartSeries series2 = new LineChartSeries();
        series2.setLabel("Series 2");

        series2.set(1, 6);
        series2.set(2, 3);
        series2.set(3, 2);
        series2.set(4, 7);
        series2.set(5, 9);

        model.addSeries(series1);
        model.addSeries(series2);

        return model;
    }

    private LineChartModel initCategoryModel() {
        LineChartModel model = new LineChartModel();

        ChartSeries boys = new ChartSeries();
        boys.setLabel("Boys");
        boys.set(100, 120);
        boys.set(20, 100);
        boys.set(26, 44);
        boys.set(72, 150);
        boys.set(20, 25);

//        ChartSeries girls = new ChartSeries();
//        girls.setLabel("Girls");
//        girls.set("2004", 52);
//        girls.set("2005", 60);
//        girls.set("2006", 110);
//        girls.set("2007", 90);
//        girls.set("2008", 120);

        model.addSeries(boys);
//        model.addSeries(girls);

        return model;
    }

}
