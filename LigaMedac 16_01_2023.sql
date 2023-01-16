#Teléfonos de cada socio que tenga una embarcación de tipo pesquero que esté en un muelle que lo atienda algún empleado de especialidad distinta a motor

select distinct telSoc.telefono, emp.nombre, emp.especialidad, em.tipo
from muelle mue join embarcacion em join empleado emp join se_encarga seenc join socio soc join telefonos_socio telSoc on 
mue.matr_embarcacion = em.matricula and soc.nif = em.nif_dueño and soc.nif = telSoc.nif_socio and 
(emp.codigo = seenc.cod_empleado and em.matricula = seenc.matr_embarcacion)
where em.tipo like "%pesquero%" and emp.especialidad not like "%motor%";


