// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorEdgeOriginAuthorizationArgs : global::Pulumi.InvokeArgs
    {
        [Input("cookieName")]
        public string? CookieName { get; set; }

        [Input("domain")]
        public string? Domain { get; set; }

        [Input("enabled")]
        public bool? Enabled { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        [Input("value")]
        public string? Value { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorEdgeOriginAuthorizationArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeOriginAuthorizationArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorEdgeOriginAuthorizationArgs();
    }
}
