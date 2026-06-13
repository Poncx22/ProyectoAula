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

                productos.add(new Producto(1, "100C", "BROCHETA DE LOMO FINO", 25000.0, "AL CARBÓN",
                                "/imgs/brocheta.png"));
                productos.add(new Producto(2, "101C", "BROCHETA DE POLLO", 23000.0, "AL CARBÓN",
                                "/imgs/brocheta.png"));
                productos.add(new Producto(3, "102C", "BROCHETA DE CHORIZO", 22000.0, "AL CARBÓN",
                                "/imgs/brocheta.png"));
                productos.add(new Producto(4, "103C", "AREPA NAPOLITANA", 8000.0, "AL CARBÓN",
                                "/imgs/arepa.png"));
                productos.add(new Producto(5, "104C", "HAMBURGUESA DE CARNE", 24000.0, "AL CARBÓN",
                                "/imgs/hamburguesa.png"));
                productos.add(new Producto(6, "105C", "ASADITA DE QUESO", 15000.0, "AL CARBÓN",
                                "/img/Productos/AsaditaQueso.png"));
                productos.add(new Producto(7, "106C", "ASADITA DE JAMON Y QUESO", 15000.0, "AL CARBÓN",
                                "/img/Productos/AsaditaJamonQueso.png"));
                productos.add(new Producto(8, "107C", "ASADITA VEGETARIANA", 18000.0, "AL CARBÓN",
                                "/img/Productos/AsaditaVegetariana.png"));
                productos.add(new Producto(9, "108C", "ASADITA DE CHORIZO", 22000.0, "AL CARBÓN",
                                "/img/Productos/AsaditaChorizo.png"));
                productos.add(new Producto(10, "109C", "ASADITA MIXTA", 25000.0, "AL CARBÓN",
                                "/img/Productos/AsaditaMixta.png"));
                productos.add(new Producto(11, "110C", "ASADITA DE POLLO", 23000.0, "AL CARBÓN",
                                "/img/Productos/AsaditaPollo.png"));
                productos.add(new Producto(12, "111C", "SANDWICH DE QUESO", 15000.0, "AL CARBÓN",
                                "/img/Productos/SandwichQueso.png"));
                productos.add(new Producto(13, "112C", "SANDWICH DE JAMON Y QUESO", 18000.0, "AL CARBÓN",
                                "/img/Productos/SandwichJamonQueso.png"));
                productos.add(new Producto(14, "113C", "SANDWICH NAPOLITANO", 18000.0, "AL CARBÓN",
                                "/img/Productos/SandwichNapolitano.png"));

                productos.add(new Producto(15, "200A", "CLUB COLOMBIA", 10000.0, "CERVEZAS",
                                "/img/Productos/ClubColombia.png"));
                productos.add(new Producto(16, "201A", "CLUB COLOMBIA ROJA", 10000.0, "CERVEZAS",
                                "/img/Productos/ClubColombiaRoja.png"));
                productos.add(new Producto(17, "202A", "CLUB COLOMBIA NEGRA", 10000.0, "CERVEZAS",
                                "/img/Productos/ClubColombiaNegra.png"));
                productos.add(new Producto(18, "203A", "AGUILA LIGHT", 10000.0, "CERVEZAS",
                                "/img/Productos/AguilaLight.png"));
                productos.add(new Producto(19, "204D", "AGUILA SIN ALCOHOL", 10000.0, "CERVEZAS",
                                "/img/Productos/AguilaSinAlcohol.png"));
                productos.add(new Producto(20, "205A", "STELLA", 15000.0, "CERVEZAS", "/img/Productos/Stella.png"));
                productos.add(new Producto(21, "206A", "CORONA", 15000.0, "CERVEZAS", "/img/Productos/Corona.png"));
                productos.add(new Producto(22, "207A", "BBC", 12000.0, "CERVEZAS", "/img/Productos/BBC.png"));
                productos.add(new Producto(23, "208A", "COSTEÑITA", 6000.0, "CERVEZAS",
                                "/img/Productos/Costeñita.png"));
                productos.add(new Producto(24, "209A", "HEINEKEN", 15000.0, "CERVEZAS", "/img/Productos/Heineken.png"));
                productos.add(new Producto(25, "210A", "CORONAZO", 30000.0, "CERVEZAS", "/img/Productos/Coronazo.png"));

                productos.add(new Producto(26, "300B", "BUCHANAN'S MASTER", 370000.0, "LICORES IMPORTADOS",
                                "/img/Productos/Corona.png"));
                productos.add(new Producto(31, "302B", "OLD PARR", 250000.0, "LICORES IMPORTADOS",
                                "/img/Productos/OldParr.png"));
                productos.add(new Producto(32, "302M", "OLD PARR", 206000.0, "LICORES IMPORTADOS",
                                "/img/Productos/OldParr.png"));
                productos
                                .add(new Producto(33, "302T", "OLD PARR", 30000.0, "LICORES IMPORTADOS",
                                                "/img/Productos/OldParr.png"));
                productos.add(new Producto(34, "303B", "JOHNNIE WALKER BLACK LABEL", 290000.0, "LICORES IMPORTADOS",
                                "/img/Productos/JohnnieWalkerBlackLabel.png"));
                productos.add(new Producto(35, "303M", "JOHNNIE WALKER BLACK LABEL", 167000.0, "LICORES IMPORTADOS",
                                "/img/Productos/JohnnieWalkerBlackLabel.png"));
                productos.add(new Producto(36, "303T", "JOHNNIE WALKER RED BLACK", 30000.0, "LICORES IMPORTADOS",
                                "/img/Productos/JohnnieWalkerBlackLabel.png"));
                productos.add(new Producto(37, "304B", "JOHNNIE WALKER RED BLACK", 170000.0, "LICORES IMPORTADOS",
                                "/img/Productos/"));
                productos.add(new Producto(107, "704D", "LIMONADA DE YERBABUENA", 15000.0, "BEBIDAS",
                                "/img/Productos/LimonadaYerbabuena.png"));
                productos.add(
                                new Producto(108, "705D", "JUGOS NATURALES", 15000.0, "BEBIDAS",
                                                "/img/Productos/JugosNaturales.png"));
                productos.add(
                                new Producto(109, "706D", "JUGOS CON LECHE", 15000.0, "BEBIDAS",
                                                "/img/Productos/JugosConLeche.png"));
                productos.add(
                                new Producto(110, "707D", "MALTEADA DE COCO", 15000.0, "BEBIDAS",
                                                "/img/Productos/MalteadaDeCoco.png"));
                productos.add(new Producto(111, "708D", "MALTEADA DE VAINILLA", 15000.0, "BEBIDAS",
                                "/img/Productos/MalteadaDeVainilla.png"));
                productos.add(new Producto(112, "709D", "COCA-COLA", 6000.0, "BEBIDAS", "/img/Productos/CocaCola.png"));
                productos.add(new Producto(113, "710D", "KOLA-ROMAN", 6000.0, "BEBIDAS",
                                "/img/Productos/KolaRoman.png"));
                productos.add(new Producto(114, "711D", "SODA BRETAÑA", 6000.0, "BEBIDAS",
                                "/img/Productos/SodaBretaña.png"));
                productos.add(new Producto(115, "712D", "SODA HATSU", 8000.0, "BEBIDAS",
                                "/img/Productos/SodaHatsu.png"));
                productos.add(
                                new Producto(116, "713D", "SODA MICHELADA", 7000.0, "BEBIDAS",
                                                "/img/Productos/SodaMichelada.png"));
                productos.add(new Producto(117, "714D", "TE HATSU", 12000.0, "BEBIDAS", "/img/Productos/TeHatsu.png"));
                productos.add(new Producto(118, "715D", "GINGER ALE", 9000.0, "BEBIDAS",
                                "/img/Productos/GingerAle.png"));
                productos.add(new Producto(119, "716D", "CAFE", 3000.0, "BEBIDAS", "/img/Productos/Cafe.png"));
                productos.add(new Producto(120, "717D", "CAFE DOBLE", 4500.0, "BEBIDAS",
                                "/img/Productos/CafeDoble.png"));
                productos.add(new Producto(121, "718D", "CAFE EXPRESSO", 3500.0, "BEBIDAS",
                                "/img/Productos/CafeExpresso.png"));
                productos.add(new Producto(122, "719D", "CAPUCCINO", 7000.0, "BEBIDAS",
                                "/img/Productos/Capuccino.png"));
                productos
                                .add(new Producto(123, "720D", "CAFE CON LECHE", 6000.0, "BEBIDAS",
                                                "/img/Productos/CafeConLeche.png"));
                productos.add(new Producto(124, "721D", "CAFE CORTADO", 4500.0, "BEBIDAS",
                                "/img/Productos/CafeCortado.png"));
                productos
                                .add(new Producto(125, "722D", "CAFE FRAPEADO", 12000.0, "BEBIDAS",
                                                "/img/Productos/CafeFrapeado.png"));
                productos.add(new Producto(126, "723D", "AGUA", 6000.0, "BEBIDAS", "/img/Productos/Agua.png"));
                productos.add(new Producto(127, "724D", "AGUA CON GAS", 6000.0, "BEBIDAS",
                                "/img/Productos/AguaConGas.png"));
                productos.add(new Producto(128, "725D", "AGUA TONICA", 8000.0, "BEBIDAS",
                                "/img/Productos/AguaTonica.png"));
                productos.add(new Producto(129, "726D", "SMIRNOFF ICE", 15000.0, "BEBIDAS",
                                "/img/Productos/SmirnoffIce.png"));
                productos.add(new Producto(130, "727D", "RED BULL", 15000.0, "BEBIDAS", "/img/Productos/RedBull.png"));
        }

        public List<Producto> findAll() {
                return productos;
        }

        public Optional<Producto> findById(int id) {
                return productos.stream()
                                .filter(p -> p.getIdProd() == id)
                                .findFirst();
        }

        // Buscar productos por nombre (búsqueda parcial, ignora mayúsculas)
        public List<Producto> findByNombre(String nombre) {
                String nombreLower = nombre.toLowerCase();
                return productos.stream()
                                .filter(p -> p.getNombreProd().toLowerCase().contains(nombreLower))
                                .collect(java.util.stream.Collectors.toList());
        }

        // Buscar productos por código (búsqueda parcial, ignora mayúsculas)
        public List<Producto> findByCodigo(String codigo) {
                String codigoLower = codigo.toLowerCase();
                return productos.stream()
                                .filter(p -> p.getCodigoProd().toLowerCase().contains(codigoLower))
                                .collect(java.util.stream.Collectors.toList());
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