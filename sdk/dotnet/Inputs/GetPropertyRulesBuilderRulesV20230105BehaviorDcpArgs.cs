// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorDcpInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("anonymous")]
        public Input<bool>? Anonymous { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("gwenabled")]
        public Input<bool>? Gwenabled { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("namespaceId")]
        public Input<string>? NamespaceId { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("tlsenabled")]
        public Input<bool>? Tlsenabled { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        [Input("wsenabled")]
        public Input<bool>? Wsenabled { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorDcpInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorDcpInputArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorDcpInputArgs();
    }
}