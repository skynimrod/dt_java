. Calculator.java
 
  准备作为JWS 的java 类.

. 第一步

  将Calculator.java  拷贝到 webapp 目录下, 重命名为"Calculator.jws"， 例如

     copy Calculator.java <your-webapp-root>/axis/Calculator.jsw 

. 第二步

  假设axis  应用程序在端口8080, 应该可以通过URL  访问这个service

  http://localhost:8080/axis/Calculator.jsw

  Axis 自动定位文件， 并编译class, 转换为SOAP  可以正确调用的java  调用服务类. 

  http://localhost:9900/axis/Calculator.jws?wsdl 
  
  就会自动产生wsdl  文件. 在浏览器中输入上述URL后，会自动生成如下WSDL

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

. 第三步

  创建WSDD  文件.  WSDD = Web Service Deployment Descriptor 

  WSDD 包含部署在AXIS的设置.  最主要的就是Web Service 的部署. 例如: deloy.wsdd

  <deployment xmlns="http://xml.apache.org/axis/wsdd" xmlns:java="http://xml.apache.org/axis/wsdd/providers/java">
	<service name="MyService" provider="java:RPC">
		<parameter name="className" value="samples.userguide.example3.MyService"/>
		<parameter name="allowedMethods" value="*">
	</service>
  </deployment>

  