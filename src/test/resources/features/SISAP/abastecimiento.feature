#language: es

@InicioAbastecimiento
Característica: Ingreso Pagina SISAP Abastecimiento

  Esquema del escenario: Ingreso a la pagina SISAP Abastecimiento
    Cuando que me encuentro en la pagina de SISAP
    Y ingreso SISAP Abastecimiento
    Y selecionamos "<PeriodoTiempo>"
    Y ingresamos "<Fecha Inicio>" y "<Fecha Final>"
    Y selecionamos mercado "<mercado>"
    Y damos click al check de selecionar todos los Productos
    Y selecionamos el Producto "<Producto>"
    Y damos click al check de selecionar todas las Variedades
    Y selecionamos la Variedad "<Variedad>"
    Y damos click al check de selecoinar todas las regiones
    Y selecionamos la Procedencia "<Procedencia>"
    Y damos click al boton Buscar
    Ejemplos:
      | PeriodoTiempo   | Fecha Inicio       | Fecha Final     |mercado                            |Producto |Variedad                           |Procedencia|
      | Diario          | 19/08/2024         |  19/09/2024     | GRAN MERCADO MAYORISTA DE LIMA    | ACEITE  | ACEITE ALSOL BALDE X 20 LT        |ACOBAMBA   |