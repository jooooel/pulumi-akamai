// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorDcpRealTimeAuthArgs : global::Pulumi.InvokeArgs
    {
        [Input("extractHostname")]
        public bool? ExtractHostname { get; set; }

        [Input("extractJurisdiction")]
        public bool? ExtractJurisdiction { get; set; }

        [Input("extractNamespace")]
        public bool? ExtractNamespace { get; set; }

        [Input("hostnameClaim")]
        public string? HostnameClaim { get; set; }

        [Input("jurisdictionClaim")]
        public string? JurisdictionClaim { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("namespaceClaim")]
        public string? NamespaceClaim { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorDcpRealTimeAuthArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorDcpRealTimeAuthArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorDcpRealTimeAuthArgs();
    }
}