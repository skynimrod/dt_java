. Calculator.java
 
  ׼����ΪJWS ��java ��.

. ��һ��

  ��Calculator.java  ������ webapp Ŀ¼��, ������Ϊ"Calculator.jws"�� ����

     copy Calculator.java <your-webapp-root>/axis/Calculator.jsw 

. �ڶ���

  ����axis  Ӧ�ó����ڶ˿�8080, Ӧ�ÿ���ͨ��URL  �������service

  http://localhost:8080/axis/Calculator.jsw

  Axis �Զ���λ�ļ��� ������class, ת��ΪSOAP  ������ȷ���õ�java  ���÷�����. 

  http://localhost:9900/axis/Calculator.jws?wsdl 
  
  �ͻ��Զ�����wsdl  �ļ�. �����������������URL�󣬻��Զ���������WSDL

  ================

<wsdl:definitions targetNamespace="http://localhost:9900/axis/Calculator.jws">
 	<!--
		WSDL created by Apache Axis version: 1.4
		Built on Apr 22, 2006 (06:55:48 PDT)
	-->
	<wsdl:message name="subtractResponse">
		<wsdl:part name="subtractReturn" type="xsd:int"/>
	</wsdl:message>

	<wsdl:message name="subtractRequest">
		<wsdl:part name="i1" type="xsd:int"/>
		<wsdl:part name="i2" type="xsd:int"/>
	</wsdl:message>

	<wsdl:message name="addResponse">
		<wsdl:part name="addReturn" type="xsd:int"/>
	</wsdl:message>

	<wsdl:message name="addRequest">
		<wsdl:part name="i1" type="xsd:int"/>
		<wsdl:part name="i2" type="xsd:int"/>
	</wsdl:message>

	<wsdl:portType name="Calculator">
		<wsdl:operation name="add" parameterOrder="i1 i2">
			<wsdl:input message="impl:addRequest" name="addRequest"/>
			<wsdl:output message="impl:addResponse" name="addResponse"/>
		</wsdl:operation>

		<wsdl:operation name="subtract" parameterOrder="i1 i2">
			<wsdl:input message="impl:subtractRequest" name="subtractRequest"/>
			<wsdl:output message="impl:subtractResponse" name="subtractResponse"/>
		</wsdl:operation>
	</wsdl:portType>

	<wsdl:binding name="CalculatorSoapBinding" type="impl:Calculator">
		<wsdlsoap:binding style="rpc" transport="http://schemas.xmlsoap.org/soap/http"/>
		<wsdl:operation name="add">
			<wsdlsoap:operation soapAction=""/>
			<wsdl:input name="addRequest">
				<wsdlsoap:body encodingStyle="http://schemas.xmlsoap.org/soap/encoding/" namespace="http://DefaultNamespace" use="encoded"/>
			</wsdl:input>
			<wsdl:output name="addResponse">
				<wsdlsoap:body encodingStyle="http://schemas.xmlsoap.org/soap/encoding/" namespace="http://localhost:9900/axis/Calculator.jws" use="encoded"/>
			</wsdl:output>
		</wsdl:operation>
		<wsdl:operation name="subtract">
			<wsdlsoap:operation soapAction=""/>
			<wsdl:input name="subtractRequest">
				<wsdlsoap:body encodingStyle="http://schemas.xmlsoap.org/soap/encoding/" namespace="http://DefaultNamespace" use="encoded"/>
			</wsdl:input>
			<wsdl:output name="subtractResponse">
				<wsdlsoap:body encodingStyle="http://schemas.xmlsoap.org/soap/encoding/" namespace="http://localhost:9900/axis/Calculator.jws" use="encoded"/>
			</wsdl:output>
		</wsdl:operation>
	</wsdl:binding>
	<wsdl:service name="CalculatorService">
		<wsdl:port binding="impl:CalculatorSoapBinding" name="Calculator">
			<wsdlsoap:address location="http://localhost:9900/axis/Calculator.jws"/>
		</wsdl:port>
	</wsdl:service>
</wsdl:definitions>

  ================

. ������

  ����WSDD  �ļ�.  WSDD = Web Service Deployment Descriptor 

  WSDD ����������AXIS������.  ����Ҫ�ľ���Web Service �Ĳ���. ����: deloy.wsdd

  <deployment xmlns="http://xml.apache.org/axis/wsdd" xmlns:java="http://xml.apache.org/axis/wsdd/providers/java">
	<service name="MyService" provider="java:RPC">
		<parameter name="className" value="samples.userguide.example3.MyService"/>
		<parameter name="allowedMethods" value="*">
	</service>
  </deployment>

  