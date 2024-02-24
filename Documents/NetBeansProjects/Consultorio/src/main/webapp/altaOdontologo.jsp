<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="components/header.jsp"%>
<%@ include file="components/bodyprimeraparte.jsp"%>

<h1>Alta Odontólogos</h1>
<p>Este es el apartado para dar de alta a los odontólogos</p>

                            <form class="user">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dni"
                                            placeholder="DNI">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre"
                                            placeholder="Nombre">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellido"
                                            placeholder="Apellido">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="telefono"
                                            placeholder="Teléfono">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="direccion"
                                            placeholder="Dirección">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="fechanac"
                                            placeholder="Fecha Nac">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="especialidad"
                                            placeholder="Especialidad">
                                    </div>
                                </div>
                               
                                <button class="btn btn-primary btn-user btn-block" type="submit">
                                    Crear Odontólogo
                                </button>
                                
                               
                             
                            </form>
                            <hr>

<%@ include file="components/bodyfinal.jsp"%>
