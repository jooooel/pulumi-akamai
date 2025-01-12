// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorRedirectInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinationHostname")]
        public Input<string>? DestinationHostname { get; set; }

        [Input("destinationHostnameOther")]
        public Input<string>? DestinationHostnameOther { get; set; }

        [Input("destinationHostnameSibling")]
        public Input<string>? DestinationHostnameSibling { get; set; }

        [Input("destinationHostnameSubdomain")]
        public Input<string>? DestinationHostnameSubdomain { get; set; }

        [Input("destinationPath")]
        public Input<string>? DestinationPath { get; set; }

        [Input("destinationPathOther")]
        public Input<string>? DestinationPathOther { get; set; }

        [Input("destinationPathPrefix")]
        public Input<string>? DestinationPathPrefix { get; set; }

        [Input("destinationPathSuffix")]
        public Input<string>? DestinationPathSuffix { get; set; }

        [Input("destinationPathSuffixStatus")]
        public Input<string>? DestinationPathSuffixStatus { get; set; }

        [Input("destinationProtocol")]
        public Input<string>? DestinationProtocol { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("mobileDefaultChoice")]
        public Input<string>? MobileDefaultChoice { get; set; }

        [Input("queryString")]
        public Input<string>? QueryString { get; set; }

        [Input("responseCode")]
        public Input<int>? ResponseCode { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorRedirectInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorRedirectInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorRedirectInputArgs();
    }
}
