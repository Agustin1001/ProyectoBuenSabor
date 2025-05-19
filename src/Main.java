import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime f1 = LocalTime.now();
        LocalDate d1 = LocalDate.now();
        Empresa empresa = new Empresa("Marin","R.I.",2045361934);

        Pais pais = new Pais("Argentina");
        Provincia provincia1 = new Provincia("Mendoza",pais);
        Localidad localidad1 = new Localidad("Guaymallen",provincia1);
        Localidad localidad2 = new Localidad("Godoy Cruz",provincia1);
        Domicilio domicilio1 = new Domicilio("NombreCalle1",1001,5519,localidad1);
        Domicilio domicilio2 = new Domicilio("NombreCalle2",2002,5501,localidad2);

        Sucursal sucursal1 = new Sucursal("MarinHamburguesas",f1,f1,domicilio1);

        Categoria hamburguesas = new Categoria("Hamburguesas");
        Categoria dobleQueso = new Categoria("Hamburguesa doble queso");
        Categoria dobleHuevo = new Categoria("Hamburguesa doble huevo");
        hamburguesas.agregarSubCategoria(dobleQueso);
        hamburguesas.agregarSubCategoria(dobleHuevo);

        Imagen imagenQueso = new Imagen("FotoQueso");
        Imagen imagenCarne = new Imagen("FotoCarne");
        ArticuloInsumo queso = new ArticuloInsumo("Queso Cheddar",1000,500,100,500,true,new UnidadMedida("Fetas"));
        ArticuloInsumo carne = new ArticuloInsumo("Medallon de Carne",1000,500,100,500,true,new UnidadMedida("Medallon de 125gr"));

        queso.agregarImagen(imagenQueso);
        carne.agregarImagen(imagenCarne);

        ArticuloManufacturadoDetalle cantQueso = new ArticuloManufacturadoDetalle(2,queso);
        ArticuloManufacturadoDetalle cantCarne = new ArticuloManufacturadoDetalle(2,carne);

        ArticuloManufacturado hambDobleQueso = new ArticuloManufacturado("Hamburguesa de Doble Queso",9500,"Hamburguesa con dos medallones de salsa, doble quesoMuzza y aderezos.", 15, "Se cocinan los medallones en la plancha, se agrega el quesoMuzza, se ponen en el pan y se agregan los aderezos.");
        Imagen fotoHambDobleQueso = new Imagen("Foto Hamburguesa de Doble Queso");
        hambDobleQueso.agregarImagen(fotoHambDobleQueso);

        Promocion dosPorUnoHamDobleQueso = new Promocion("2 Hamburguesas al Precio de Unas",d1, d1, f1, f1,"Pagando por una hamburguesa doble quesoMuzza te llevas otra de regalo.", 9500.00, TipoPromocion.HAPPYHOUR );
        dosPorUnoHamDobleQueso.agregarArticulo(hambDobleQueso);
        Imagen imagen2x1HambDobleQueso = new Imagen("Imagen promocion 2x1 hamburguesa.");
        dosPorUnoHamDobleQueso.agregarImagen(imagen2x1HambDobleQueso);

        sucursal1.agregarPromocion(dosPorUnoHamDobleQueso);

        sucursal1.agregarCategoria(hamburguesas);

        dobleQueso.agregarArticulo(hambDobleQueso);
        hambDobleQueso.agregarArticuloManufacturadoDetalle(cantQueso);
        hambDobleQueso.agregarArticuloManufacturadoDetalle(cantCarne);

        Sucursal sucursal2 = new Sucursal("MarinPizzas",f1,f1,domicilio2);

        Categoria pizza = new Categoria("Pizza");
        Categoria muzzarella = new Categoria("Muzzarella");
        Categoria fugazzeta = new Categoria("Fugazzeta");
        pizza.agregarSubCategoria(muzzarella);
        pizza.agregarSubCategoria(fugazzeta);

        Imagen imagenMuzzarella = new Imagen("FotoMuzzarella");
        Imagen imagenSalsa = new Imagen("FotoSalsa");

        ArticuloInsumo quesoMuzza = new ArticuloInsumo("Queso Muzzarella",1000,500,100,500,true,new UnidadMedida("Fetas"));
        ArticuloInsumo salsa = new ArticuloInsumo("Salsa de Pizza",1000,500,100,500,true,new UnidadMedida("Botella de 500ml"));


        quesoMuzza.agregarImagen(imagenMuzzarella);
        salsa.agregarImagen(imagenSalsa);

        ArticuloManufacturadoDetalle cantQuesoMuzza = new ArticuloManufacturadoDetalle(10,quesoMuzza);
        ArticuloManufacturadoDetalle cantSalsa = new ArticuloManufacturadoDetalle(1,salsa);

        ArticuloManufacturado pizzaMuzzarella = new ArticuloManufacturado("Pizza Muzzarella",9500,"Nuesta famosa pizza con el mejor queso Muzzarella.", 15, "Se cocina la masa en el horno, se agrega la salsa y el queso muzzarela. Vuelve al horno por 5 minutos.");
        Imagen fotoPizzaMuzzarella = new Imagen("Foto Muzzarellas");
        pizzaMuzzarella.agregarImagen(fotoPizzaMuzzarella);

        Promocion dosPorUnoMuzzarella = new Promocion("2 Muzzarellas al Precio de Una",d1, d1, f1, f1,"Pagando por una Muzzarella te llevas otra de regalo.", 15500.00, TipoPromocion.HAPPYHOUR );
        dosPorUnoMuzzarella.agregarArticulo(pizzaMuzzarella);
        Imagen imagen2x1Muzzarella = new Imagen("Imagen promocion 2x1 Muzzarellas.");
        dosPorUnoMuzzarella.agregarImagen(imagen2x1Muzzarella);


        sucursal2.agregarPromocion(dosPorUnoMuzzarella);

        sucursal2.agregarCategoria(pizza);

        muzzarella.agregarArticulo(pizzaMuzzarella);
        pizzaMuzzarella.agregarArticuloManufacturadoDetalle(cantQuesoMuzza);
        pizzaMuzzarella.agregarArticuloManufacturadoDetalle(cantSalsa);


        empresa.agregarSucursal(sucursal1);
        empresa.agregarSucursal(sucursal2);
        System.out.println(empresa);


        Factura facturaCompra = new Factura(d1,1,1,"1",
                "1",FormaPago.EFECTIVO,10500.0);


        Usuario user1 = new Usuario("1ASD1ASD","agmarin1");
        Imagen imagenUser1 = new Imagen("FotoUsuario");
        Localidad localidad3 = new Localidad("Cuidad", provincia1);
        Domicilio dom3 = new Domicilio("San Martin", 1200, 5500, localidad3);

        Cliente cliente1 = new Cliente("Agustin","Marin", "2611234567",
                "agmarin@gmail.com",d1,user1, imagenUser1, dom3);

        DetallePedido detallePedido1 = new DetallePedido(1, 9500.00, hambDobleQueso);



        Pedido pedido1 = new Pedido(f1,10500.0,5000.0,Estado.PREPARACION,
                TipoEnvio.DELIVERY,FormaPago.EFECTIVO,d1,sucursal1,dom3,facturaCompra);
        pedido1.agregarDetalleAlPedido(detallePedido1);

        cliente1.agregarPedido(pedido1);

        System.out.println(cliente1);
    }
}