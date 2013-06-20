## vaccinationimporter 4.2
*  Opgrading til sdm4-core 4.3, der løser
   NSPSUPPORT-126: ParserExecutor logger filers absolutte stier og md5-summer inden parser behandler dem
*  Opdateret SDM4 depencencies
*  SDM-5 SLA-log fra SDM4-importere følger ikke standarden
*  Tilføjet kopi register view, så kopi register service maps nu bliver oprettet automatisk

## vaccinationimporter 4.3
* Tilføjet historik således at tabellerne ikke trunceres inden import og kun forskelle i forhold til tidligere
  bliver gemt.
* Ændret streng datoer tilbage til mysql datetimes