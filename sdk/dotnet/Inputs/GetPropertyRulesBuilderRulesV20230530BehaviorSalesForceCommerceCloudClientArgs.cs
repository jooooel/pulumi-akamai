// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowOverrideOriginCacheKey")]
        public Input<bool>? AllowOverrideOriginCacheKey { get; set; }

        [Input("connectorId")]
        public Input<string>? ConnectorId { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("originHostHeader")]
        public Input<string>? OriginHostHeader { get; set; }

        [Input("originType")]
        public Input<string>? OriginType { get; set; }

        [Input("sf3cOriginHost")]
        public Input<string>? Sf3cOriginHost { get; set; }

        [Input("sf3cOriginHostHeader")]
        public Input<string>? Sf3cOriginHostHeader { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorSalesForceCommerceCloudClientInputArgs();
    }
}