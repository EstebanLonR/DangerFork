# language: es
@FeatureName: aplicarCodigoDeDescuento

Característica: Aplicar codigo de descuento
  Como usuario del aplicativo
  Quiero conocer los el precio de un viaje
  Para poder realizar análisis de dinámicas políticas inter y transcontinentales

  @ScenarioName: cotizacionDeViajeConDescuento
  Escenario: Cotizacion de viaje con descuento
    Dado que el usuario se encuentra en la pagina principal del aplicativo
    Cuando cotiza su viaje a "Shenji" y aplica el codigo "PROMO"
    Entonces debera ver que el precio del viaje sin descuento es de "1089.07"
    Y el precio con descuento sera de "871.26"