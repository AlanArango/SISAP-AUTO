#language: es
@InicioPrecio
Característica: Ingreso Pagina SISAP Precios

  Esquema del escenario: Ingreso a la pagina SISAP Precios
    Cuando que me encuentro en la pagina de SISAP
    Y ingreso SISAP Precio
    Y damos click al check de Todas las ciudades
    Y selecionamos la ciudad "<ciudad>"
    Y selecionamos Tipo Mercado "<tipoMercado>"
    Y selecionamos "<PeriodoTiempo>"
    Y ingresamos "<Fecha Inicio>" y "<Fecha Final>"
    Y damos click al check de selecionar todos los Productos
    Y selecionamos el Producto "<Producto>"
    Y damos click al check de selecionar todas las Variedades
    Y selecionamos la Variedad "<Variedad>"
    Y damos click al boton Buscar

    Ejemplos:
      | ciudad   | tipoMercado | PeriodoTiempo | Fecha Inicio | Fecha Final | Producto | Variedad                   |
      | AMAZONAS | Minorista   | Diario        | 19/08/2024   | 19/09/2024  | ACEITE   | ACEITE ALSOL BALDE X 20 LT |