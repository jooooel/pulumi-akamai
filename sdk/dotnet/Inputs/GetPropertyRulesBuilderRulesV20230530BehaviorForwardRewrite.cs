// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteArgs : global::Pulumi.InvokeArgs
    {
        [Input("cloudletPolicy")]
        public Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteCloudletPolicyArgs? CloudletPolicy { get; set; }

        [Input("cloudletSharedPolicy")]
        public int? CloudletSharedPolicy { get; set; }

        [Input("enabled")]
        public bool? Enabled { get; set; }

        [Input("isSharedPolicy")]
        public bool? IsSharedPolicy { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorForwardRewriteArgs();
    }
}
