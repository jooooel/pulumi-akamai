// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorSetVariableInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        [Input("caseSensitive")]
        public Input<bool>? CaseSensitive { get; set; }

        [Input("certificateFieldName")]
        public Input<string>? CertificateFieldName { get; set; }

        [Input("cookieName")]
        public Input<string>? CookieName { get; set; }

        [Input("deviceProfile")]
        public Input<string>? DeviceProfile { get; set; }

        [Input("encryptionKey")]
        public Input<string>? EncryptionKey { get; set; }

        [Input("encryptionMode")]
        public Input<string>? EncryptionMode { get; set; }

        [Input("endIndex")]
        public Input<string>? EndIndex { get; set; }

        [Input("exceptChars")]
        public Input<string>? ExceptChars { get; set; }

        [Input("extractLocation")]
        public Input<string>? ExtractLocation { get; set; }

        [Input("forceChars")]
        public Input<string>? ForceChars { get; set; }

        [Input("formatString")]
        public Input<string>? FormatString { get; set; }

        [Input("generator")]
        public Input<string>? Generator { get; set; }

        [Input("globalSubstitution")]
        public Input<bool>? GlobalSubstitution { get; set; }

        [Input("headerName")]
        public Input<string>? HeaderName { get; set; }

        [Input("hmacAlgorithm")]
        public Input<string>? HmacAlgorithm { get; set; }

        [Input("hmacKey")]
        public Input<string>? HmacKey { get; set; }

        [Input("initializationVector")]
        public Input<string>? InitializationVector { get; set; }

        [Input("ipVersion")]
        public Input<string>? IpVersion { get; set; }

        [Input("ipv4Prefix")]
        public Input<int>? Ipv4Prefix { get; set; }

        [Input("ipv6Prefix")]
        public Input<int>? Ipv6Prefix { get; set; }

        [Input("locationId")]
        public Input<string>? LocationId { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("max")]
        public Input<int>? Max { get; set; }

        [Input("maxRandomNumber")]
        public Input<string>? MaxRandomNumber { get; set; }

        [Input("min")]
        public Input<int>? Min { get; set; }

        [Input("minRandomNumber")]
        public Input<string>? MinRandomNumber { get; set; }

        [Input("nonce")]
        public Input<string>? Nonce { get; set; }

        [Input("numberOfBytes")]
        public Input<int>? NumberOfBytes { get; set; }

        [Input("operandOne")]
        public Input<string>? OperandOne { get; set; }

        [Input("paramName")]
        public Input<string>? ParamName { get; set; }

        [Input("pathComponentOffset")]
        public Input<string>? PathComponentOffset { get; set; }

        [Input("prependBytes")]
        public Input<bool>? PrependBytes { get; set; }

        [Input("queryParameterName")]
        public Input<string>? QueryParameterName { get; set; }

        [Input("regex")]
        public Input<string>? Regex { get; set; }

        [Input("replacement")]
        public Input<string>? Replacement { get; set; }

        [Input("responseHeaderName")]
        public Input<string>? ResponseHeaderName { get; set; }

        [Input("separator")]
        public Input<string>? Separator { get; set; }

        [Input("setCookieName")]
        public Input<string>? SetCookieName { get; set; }

        [Input("startIndex")]
        public Input<string>? StartIndex { get; set; }

        [Input("subString")]
        public Input<string>? SubString { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("transform")]
        public Input<string>? Transform { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        [Input("valueSource")]
        public Input<string>? ValueSource { get; set; }

        [Input("variableName")]
        public Input<string>? VariableName { get; set; }

        [Input("variableValue")]
        public Input<string>? VariableValue { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorSetVariableInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorSetVariableInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorSetVariableInputArgs();
    }
}