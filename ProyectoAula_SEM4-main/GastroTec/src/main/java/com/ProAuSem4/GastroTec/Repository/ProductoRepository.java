package com.ProAuSem4.GastroTec.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ProAuSem4.GastroTec.Model.Producto;

@Repository
public class ProductoRepository {
    private List<Producto> productos = new ArrayList<>();
    private int nextId = 131; 

    public ProductoRepository() {

        productos.add(new Producto(1, "100C", "BROCHETA DE LOMO FINO", 25000.0, "AL CARBÓN"));
        productos.add(new Producto(2, "101C", "BROCHETA DE POLLO", 23000.0, "AL CARBÓN"));
        productos.add(new Producto(3, "102C", "BROCHETA DE CHORIZO", 22000.0, "AL CARBÓN"));
        productos.add(new Producto(4, "103C", "AREPA NAPOLITANA", 8000.0, "AL CARBÓN"));
        productos.add(new Producto(5, "104C", "HAMBURGUESA DE CARNE", 24000.0, "AL CARBÓN"));
        productos.add(new Producto(6, "105C", "ASADITA DE QUESO", 15000.0, "AL CARBÓN"));
        productos.add(new Producto(7, "106C", "ASADITA DE JAMON Y QUESO", 15000.0, "AL CARBÓN"));
        productos.add(new Producto(8, "107C", "ASADITA VEGETARIANA", 18000.0, "AL CARBÓN"));
        productos.add(new Producto(9, "108C", "ASADITA DE CHORIZO", 22000.0, "AL CARBÓN"));
        productos.add(new Producto(10, "109C", "ASADITA MIXTA", 25000.0, "AL CARBÓN"));
        productos.add(new Producto(11, "110C", "ASADITA DE POLLO", 23000.0, "AL CARBÓN"));
        productos.add(new Producto(12, "111C", "SANDWICH DE QUESO", 15000.0, "AL CARBÓN"));
        productos.add(new Producto(13, "112C", "SANDWICH DE JAMON Y QUESO", 18000.0, "AL CARBÓN"));
        productos.add(new Producto(14, "113C", "SANDWICH NAPOLITANO", 18000.0, "AL CARBÓN"));

        productos.add(new Producto(15, "200A", "CLUB COLOMBIA", 10000.0, "CERVEZAS"));
        productos.add(new Producto(16, "201A", "CLUB COLOMBIA ROJA", 10000.0, "CERVEZAS"));
        productos.add(new Producto(17, "202A", "CLUB COLOMBIA NEGRA", 10000.0, "CERVEZAS"));
        productos.add(new Producto(18, "203A", "AGUILA LIGHT", 10000.0, "CERVEZAS"));
        productos.add(new Producto(19, "204D", "AGUILA SIN ALCOHOL", 10000.0, "CERVEZAS"));
        productos.add(new Producto(20, "205A", "STELLA", 15000.0, "CERVEZAS"));
        productos.add(new Producto(21, "206A", "CORONA", 15000.0, "CERVEZAS"));
        productos.add(new Producto(22, "207A", "BBC", 12000.0, "CERVEZAS"));
        productos.add(new Producto(23, "208A", "COSTEÑITA", 6000.0, "CERVEZAS"));
        productos.add(new Producto(24, "209A", "HEINEKEN", 15000.0, "CERVEZAS"));
        productos.add(new Producto(25, "210A", "CORONAZO", 30000.0, "CERVEZAS"));

        productos.add(new Producto(26, "300B", "BUCHANAN'S MASTER", 370000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(27, "300T", "BUCHANAN'S MASTER", 40000.0, "LICORES IMPORTADOS")); // ID consecutivo, Código diferente
        productos.add(new Producto(28, "301B", "BUCHANAN'S DE LUXE", 300000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(29, "301M", "BUCHANAN'S DE LUXE", 200000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(30, "301T", "BUCHANAN'S DE LUXE", 30000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(31, "302B", "OLD PARR", 250000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(32, "302M", "OLD PARR", 206000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(33, "302T", "OLD PARR", 30000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(34, "303B", "JOHNNIE WALKER BLACK LABEL", 290000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(35, "303M", "JOHNNIE WALKER BLACK LABEL", 167000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(36, "303T", "JOHNNIE WALKER BLACK LABEL", 30000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(37, "304B", "JOHNNIE WALKER RED BLACK", 170000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(38, "304M", "JOHNNIE WALKER RED BLACK", 112000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(39, "304T", "JOHNNIE WALKER RED BLACK", 20000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(40, "305B", "VODKA SMIRNOFF", 200000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(41, "305M", "VODKA SMIRNOFF", 120000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(42, "305T", "VODKA SMIRNOFF", 20000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(43, "306B", "TEQUILA JOSE CUERVO", 200000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(44, "306M", "TEQUILA JOSE CUERVO", 120000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(45, "306T", "TEQUILA JOSE CUERVO", 20000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(46, "307B", "TEQUILA DON JULIO REPOSADO", 470000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(47, "307T", "TEQUILA DON JULIO REPOSADO", 45000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(48, "308B", "TEQUILA DON JULIO SILVER", 375000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(49, "308T", "TEQUILA DON JULIO SILVER", 40000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(50, "309B", "GINEBRA GORDONS", 175000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(51, "309T", "GINEBRA GORDONS", 20000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(52, "310B", "GINEBRA TANQUERAY", 300000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(53, "310T", "GINEBRA TANQUERAY", 35000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(54, "311B", "RON ZACAPA AMBAR", 280000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(55, "311T", "RON ZACAPA AMBAR", 30000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(56, "312B", "RON ZACAPA 23 AÑOS", 403000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(57, "312T", "RON ZACAPA 23 AÑOS", 45000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(58, "313B", "BAILEY'S", 160000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(59, "313M", "BAILEY'S", 100000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(60, "313T", "BAILEY'S", 20000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(61, "314T", "MARTINI", 20000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(62, "315T", "BRANDY", 20000.0, "LICORES IMPORTADOS"));
        productos.add(new Producto(63, "316T", "AMARETO", 20000.0, "LICORES IMPORTADOS"));

        productos.add(new Producto(64, "400B", "AGUARDIENTE", 100000.0, "LICORES NACIONALES"));
        productos.add(new Producto(65, "400M", "AGUARDIENTE", 75000.0, "LICORES NACIONALES"));
        productos.add(new Producto(66, "400T", "AGUARDIENTE", 15000.0, "LICORES NACIONALES"));
        productos.add(new Producto(67, "401B", "RON VIEJO DE CALDAS", 100000.0, "LICORES NACIONALES"));
        productos.add(new Producto(68, "401M", "RON VIEJO DE CALDAS", 75000.0, "LICORES NACIONALES"));
        productos.add(new Producto(69, "401T", "RON VIEJO DE CALDAS", 15000.0, "LICORES NACIONALES"));

        productos.add(new Producto(70, "500B", "GATO NEGRO-187 ML", 25000.0, "VINOS"));
        productos.add(new Producto(71, "501B", "SANTA HELENA-187 ML", 250000.0, "VINOS"));
        productos.add(new Producto(72, "502B", "VINO ESPUMOSO FRIZZANTINO ROSADO", 80000.0, "VINOS"));
        productos.add(new Producto(73, "503B", "BARON DE ROTHER BRUT", 90000.0, "VINOS"));

        productos.add(new Producto(74, "600K", "BOMBA CARTAGENERA", 40000.0, "COCTELES DE LA CASA"));
        productos.add(new Producto(75, "601K", "MOJITO CARTAGENERO", 28000.0, "COCTELES DE LA CASA"));
        productos.add(new Producto(76, "602K", "MYTAL CARTAGENERO", 25000.0, "COCTELES DE LA CASA"));
        productos.add(new Producto(77, "603K", "GALERIA", 25000.0, "COCTELES DE LA CASA"));

        productos.add(new Producto(78, "604K", "DESTORNILLADOR", 28000.0, "CÓCTELES CON VODKA"));
        productos.add(new Producto(79, "605K", "KAIPIRIOSCA", 28000.0, "CÓCTELES CON VODKA"));
        productos.add(new Producto(80, "606K", "LA PALABRA", 28000.0, "CÓCTELES CON VODKA"));
        productos.add(new Producto(81, "607K", "VERANO FELIZ", 28000.0, "CÓCTELES CON VODKA"));
        
        productos.add(new Producto(82, "608K", "CAIPIRIÑA", 30000.0, "CÓCTELES CON RON"));
        productos.add(new Producto(83, "609K", "PIÑA COLADA", 30000.0, "CÓCTELES CON RON"));
        productos.add(new Producto(84, "610K", "MOJITO CUBANO", 28000.0, "CÓCTELES CON RON"));
        productos.add(new Producto(85, "611K", "CUBA LIBRE", 20000.0, "CÓCTELES CON RON"));
        productos.add(new Producto(86, "612K", "DAIQUIRI", 28000.0, "CÓCTELES CON RON"));
        productos.add(new Producto(87, "613K", "CÓCTEL DE FRUTAS", 28000.0, "CÓCTELES CON RON"));
        productos.add(new Producto(88, "614K", "ZOMBIE", 28000.0, "CÓCTELES CON RON"));

   
        productos.add(new Producto(89, "615K", "TOMS COLLINS / GORDONS", 30000.0, "CÓCTELES CON GINEBRA"));
        productos.add(new Producto(90, "616K", "TOMS COLLINS / TANQUERAY", 30000.0, "CÓCTELES CON GINEBRA"));
        productos.add(new Producto(91, "617K", "MOJITO CUBANO", 28000.0, "CÓCTELES CON GINEBRA")); 
        productos.add(new Producto(92, "618K", "GIN TONIC / GORDONS", 20000.0, "CÓCTELES CON GINEBRA"));
        productos.add(new Producto(93, "619K", "GIN TONIC / TANQUERAY", 28000.0, "CÓCTELES CON GINEBRA"));
        productos.add(new Producto(94, "620K", "DRY MARTINI / GORDON", 20000.0, "CÓCTELES CON GINEBRA"));
        productos.add(new Producto(95, "621K", "DRY MARTINI / TANQUERAY", 28000.0, "CÓCTELES CON GINEBRA"));
        productos.add(new Producto(96, "622K", "GIN FIZZ", 28000.0, "CÓCTELES CON GINEBRA"));

        productos.add(new Producto(97, "623K", "MARGARITA / JOSE CUERVO", 28000.0, "CÓCTELES CON TEQUILA"));
        productos.add(new Producto(98, "624K", "MARGARITA / DON JULIO", 38000.0, "CÓCTELES CON TEQUILA"));
        productos.add(new Producto(99, "625K", "TEQUILA SUNRISE", 38000.0, "CÓCTELES CON TEQUILA"));
        productos.add(new Producto(100, "626K", "TEQUILA DERBY", 28000.0, "CÓCTELES CON TEQUILA"));
        productos.add(new Producto(101, "627K", "TEQUINI", 28000.0, "CÓCTELES CON TEQUILA"));

        productos.add(new Producto(102, "628K", "ALEXANDAR", 25000.0, "CÓCTELES CON BRANDY"));
        productos.add(new Producto(103, "629K", "ORANGE BRANDY", 25000.0, "CÓCTELES CON BRANDY"));
        productos.add(new Producto(104, "701D", "LIMONADA NATURAL", 15000.0, "BEBIDAS"));
        productos.add(new Producto(105, "702D", "LIMONADA DE COCO", 15000.0, "BEBIDAS"));
        productos.add(new Producto(106, "703D", "LIMONADA CEREZADA", 15000.0, "BEBIDAS"));
        productos.add(new Producto(107, "704D", "LIMONADA DE YERBABUENA", 15000.0, "BEBIDAS"));
        productos.add(new Producto(108, "705D", "JUGOS NATURALES", 15000.0, "BEBIDAS"));
        productos.add(new Producto(109, "706D", "JUGOS CON LECHE", 15000.0, "BEBIDAS"));
        productos.add(new Producto(110, "707D", "MALTEADA DE COCO", 15000.0, "BEBIDAS"));
        productos.add(new Producto(111, "708D", "MALTEADA DE VAINILLA", 15000.0, "BEBIDAS"));
        productos.add(new Producto(112, "709D", "COCA-COLA", 6000.0, "BEBIDAS"));
        productos.add(new Producto(113, "710D", "KOLA-ROMAN", 6000.0, "BEBIDAS"));
        productos.add(new Producto(114, "711D", "SODA BRETAÑA", 6000.0, "BEBIDAS"));
        productos.add(new Producto(115, "712D", "SODA HATSU", 8000.0, "BEBIDAS"));
        productos.add(new Producto(116, "713D", "SODA MICHELADA", 7000.0, "BEBIDAS"));
        productos.add(new Producto(117, "714D", "TE HATSU", 12000.0, "BEBIDAS"));
        productos.add(new Producto(118, "715D", "GINGER ALE", 9000.0, "BEBIDAS"));
        productos.add(new Producto(119, "716D", "CAFE", 3000.0, "BEBIDAS"));
        productos.add(new Producto(120, "717D", "CAFE DOBLE", 4500.0, "BEBIDAS"));
        productos.add(new Producto(121, "718D", "CAFE EXPRESSO", 3500.0, "BEBIDAS"));
        productos.add(new Producto(122, "719D", "CAPUCCINO", 7000.0, "BEBIDAS"));
        productos.add(new Producto(123, "720D", "CAFE CON LECHE", 6000.0, "BEBIDAS"));
        productos.add(new Producto(124, "721D", "CAFE CORTADO", 4500.0, "BEBIDAS"));
        productos.add(new Producto(125, "722D", "CAFE FRAPEADO", 12000.0, "BEBIDAS"));
        productos.add(new Producto(126, "723D", "AGUA", 6000.0, "BEBIDAS"));
        productos.add(new Producto(127, "724D", "AGUA CON GAS", 6000.0, "BEBIDAS"));
        productos.add(new Producto(128, "725D", "AGUA TONICA", 8000.0, "BEBIDAS"));
        productos.add(new Producto(129, "726D", "SMIRNOFF ICE", 15000.0, "BEBIDAS"));
        productos.add(new Producto(130, "727D", "RED BULL", 15000.0, "BEBIDAS"));
    }

    public List<Producto> findAll() {
        return productos;
    }

    public Optional<Producto> findById(int id) {
        return productos.stream()
                .filter(p -> p.getIdProd() == id)
                .findFirst();
    }

    public Producto save(Producto producto) {
        if (producto.getIdProd() == 0) { 
            producto.setIdProd(nextId++); // asigna un ID automáticamente
        }
        productos.removeIf(c -> c.getIdProd() == producto.getIdProd()); // elimina el viejo si existe
        productos.add(producto); // guarda el nuevo o actualizado
        return producto;
    }

    public boolean deleteById(int id) {
        return productos.removeIf(p -> p.getIdProd() == id);
    }
}