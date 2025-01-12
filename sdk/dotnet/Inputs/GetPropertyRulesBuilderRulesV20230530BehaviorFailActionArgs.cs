// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorFailActionInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("actionType")]
        public Input<string>? ActionType { get; set; }

        [Input("allowFcmParentOverride")]
        public Input<bool>? AllowFcmParentOverride { get; set; }

        [Input("cexCustomPath")]
        public Input<bool>? CexCustomPath { get; set; }

        [Input("cexHostname")]
        public Input<string>? CexHostname { get; set; }

        [Input("cexPath")]
        public Input<string>? CexPath { get; set; }

        [Input("contentCustomPath")]
        public Input<bool>? ContentCustomPath { get; set; }

        [Input("contentHostname")]
        public Input<string>? ContentHostname { get; set; }

        [Input("contentPath")]
        public Input<string>? ContentPath { get; set; }

        [Input("cpCode")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorFailActionCpCodeInputArgs>? CpCode { get; set; }

        [Input("dynamicCustomPath")]
        public Input<bool>? DynamicCustomPath { get; set; }

        [Input("dynamicMethod")]
        public Input<string>? DynamicMethod { get; set; }

        [Input("dynamicPath")]
        public Input<string>? DynamicPath { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("modifyProtocol")]
        public Input<bool>? ModifyProtocol { get; set; }

        [Input("netStorageHostname")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorFailActionNetStorageHostnameInputArgs>? NetStorageHostname { get; set; }

        [Input("netStoragePath")]
        public Input<string>? NetStoragePath { get; set; }

        [Input("preserveQueryString")]
        public Input<bool>? PreserveQueryString { get; set; }

        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        [Input("redirectCustomPath")]
        public Input<bool>? RedirectCustomPath { get; set; }

        [Input("redirectHostname")]
        public Input<string>? RedirectHostname { get; set; }

        [Input("redirectHostnameType")]
        public Input<string>? RedirectHostnameType { get; set; }

        [Input("redirectMethod")]
        public Input<int>? RedirectMethod { get; set; }

        [Input("redirectPath")]
        public Input<string>? RedirectPath { get; set; }

        [Input("saasCnameEnabled")]
        public Input<bool>? SaasCnameEnabled { get; set; }

        [Input("saasCnameLevel")]
        public Input<int>? SaasCnameLevel { get; set; }

        [Input("saasCookie")]
        public Input<string>? SaasCookie { get; set; }

        [Input("saasQueryString")]
        public Input<string>? SaasQueryString { get; set; }

        [Input("saasRegex")]
        public Input<string>? SaasRegex { get; set; }

        [Input("saasReplace")]
        public Input<string>? SaasReplace { get; set; }

        [Input("saasSuffix")]
        public Input<string>? SaasSuffix { get; set; }

        [Input("saasType")]
        public Input<string>? SaasType { get; set; }

        [Input("statusCode")]
        public Input<int>? StatusCode { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorFailActionInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorFailActionInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorFailActionInputArgs();
    }
}
