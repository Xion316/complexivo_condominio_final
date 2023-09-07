/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author hack2
 */
public class apartamento {
    private double area_ocupa; // area en m^2
    private String numero_apartamento; // se decidio como string ya que el numero de un apartamento puede ser 6-E o A-12
    private double valor_apartamento;
    private inquilino dueño_apartamento;
    private int cant_ali_cuota_adeuda;

    public apartamento(double area_ocupa, String numero_apartamento, double valor_apartamento, inquilino dueño_apartamento, int cant_ali_cuota_adeuda) {
        this.area_ocupa = area_ocupa;
        this.numero_apartamento = numero_apartamento;
        this.valor_apartamento = valor_apartamento;
        this.dueño_apartamento = dueño_apartamento;
        this.cant_ali_cuota_adeuda = cant_ali_cuota_adeuda;
    }
    

    public String getNumero_apartamento() {
        return numero_apartamento;
    }

    public void setNumero_apartamento(String numero_apartamento) {
        this.numero_apartamento = numero_apartamento;
    }

    public double getArea_ocupa() {
        return area_ocupa;
    }

    public void setArea_ocupa(double area_ocupa) {
        this.area_ocupa = area_ocupa;
    }

    public double getValor_apartamento() {
        return valor_apartamento;
    }

    public void setValor_apartamento(double valor_apartamento) {
        this.valor_apartamento = valor_apartamento;
    }

    public inquilino getDueño_apartamento() {
        return dueño_apartamento;
    }

    public void setDueño_apartamento(inquilino dueño_apartamento) {
        this.dueño_apartamento = dueño_apartamento;
    }

    public int getCant_ali_cuota_adeuda() {
        return cant_ali_cuota_adeuda;
    }

    public void setCant_ali_cuota_adeuda(int cant_ali_cuota_adeuda) {
        this.cant_ali_cuota_adeuda = cant_ali_cuota_adeuda;
    }

   
    public double get_alicuota_paga_Mensual(){
        return this.getArea_ocupa(); // 1 * lo que sea siempre dara ese lo que sea el 1 esta de mas
    }
    
    // literal 2)
    
    public double get_total_monto_alicuentas_adeuda(){
        return this.getCant_ali_cuota_adeuda()* this.get_alicuota_paga_Mensual();
    }
    
    
}
